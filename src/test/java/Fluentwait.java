import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Fluentwait {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://in.bookmyshow.com/");
        WebElement hyd=driver.findElement(By.xpath("(//div[@class='bwc__sc-ttnkwg-17 gvzyfS'])[4]//img"));
        Wait<WebDriver> wait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(TimeoutException.class);
        WebElement hydEle = wait.until(ExpectedConditions.elementToBeClickable(hyd));
        hydEle.click();
        Thread.sleep(3000);
        driver.quit();
    }

}
