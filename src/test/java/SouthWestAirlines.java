import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class SouthWestAirlines {
    public static void main(String[] args) throws ParseException, InterruptedException {

        ChromeOptions options=new ChromeOptions();
//        options.addArguments("--headless-mode");
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--enable-logging");
        options.addArguments("--headless");
        WebDriver driver=new ChromeDriver(options);

//        driver.manage().window().maximize();
        driver.navigate().to("https://www.southwest.com/?ref=southwestairlines.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        WebElement departureDateTextfield=driver.findElement(By.xpath("//*[@name='departureDate']"));
//        driver.findElement(By.xpath("//*[@name='departureDate']"));
        Wait<WebDriver> wait= new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.elementToBeClickable(departureDateTextfield)).click();
//        Thread.sleep(2000);
//        wait.until(ExpectedConditions.elementToBeSelected(departureDateTextfield));
//        departureDateTextfield.clear();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("arguments[0].setAttribute('style','border: 2px solid red;');",departureDateTextfield);

        Date date =new Date();
        String strDate=date.toString();
        System.out.println(strDate);
        String day = String.format("%td",date);
        String month=String.format("%tm",date);
        String charmonth=String.format("%tb",date);
        String fullCharmonth=String.format("%tB",date);
        String year=String.format("%tY",date);
        int futureDate=Integer.parseInt(day)+5;

        System.out.println(Integer.parseInt(day)+5);

        String actualDepartureDate=driver.findElement(By.xpath("(//*[@class='monthAndYearTitle__zzktg'])[1]")).getText();
        String expectedDepartureDate=fullCharmonth+" "+year;
        System.out.println("Actual date"+actualDepartureDate);
        System.out.println("Expected date"+expectedDepartureDate);
        while(!actualDepartureDate.equalsIgnoreCase(expectedDepartureDate)){
            driver.findElement(By.xpath("//*[@class='nextOption__PJT4h']")).click();
        }
        //selecting future date by adding 5 to current day
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//*[@class='days__JrkqY']/div/div/div[contains(text(),'"+futureDate+"')])[1]")))).click();
        while(!actualDepartureDate.equalsIgnoreCase(expectedDepartureDate)){
            driver.findElement(By.xpath("//*[@class='nextOption__PJT4h']")).click();
        }
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//*[@class='days__JrkqY']/div/div/div[contains(text(),'"+futureDate+"')])[2]")))).click();
        System.out.println("outside calendar");
        driver.findElement(By.xpath("(//*[@class='indicator__udFvE iconContainer__yU2Yi'])[1]/span")).click();
        try {
//            Select select=new Select(driver.findElement(By.xpath("//*[@class='list__MCjgN minimumListWidthSmall__MPHyO']")));
//                    select.selectByIndex(1);
            List<WebElement> tripList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='list__MCjgN minimumListWidthSmall__MPHyO']")));

        for(WebElement e:tripList){
            if(e.getText().equalsIgnoreCase("Round-trip")){
                e.click();
            }
            System.out.println(e.getText());
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }



    }



}
