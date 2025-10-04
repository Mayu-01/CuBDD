package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLOutput;
import java.util.List;


public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {

      WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dmart.in/");
        String handle = driver.getWindowHandle();
        System.out.println(handle);
        driver.switchTo().window("E847F5F0B77D84CCE42FB1ABA88203CA");

//        Alert alert1=driver.switchTo().alert();
//          alert1.sendKeys("Hyderabad");
//        List<WebElement> allLinks=driver.findElements(By.tagName("link"));
//        System.out.println("Total links are :"+allLinks.size());
//        List<WebElement> allImgLinks=driver.findElements(By.tagName("img"));
//        allLinks.addAll(allImgLinks);
//        System.out.println("Total links are :"+allLinks.size());
//        System.out.println("Total img links are :"+allImgLinks.size());
//        for(WebElement e:allLinks){
//        String attributeName=e.getAttribute("href");
//            System.out.println(attributeName);
//            if(attributeName==null || attributeName.isEmpty()){
//                System.out.println("link is empty: "+attributeName);
//            }else {
//                URL url=new URL(attributeName);
//                URLConnection urlConnection=url.openConnection();
//                HttpURLConnection httpUrlConnection=(HttpURLConnection)urlConnection;
//                int i=httpUrlConnection.getResponseCode();
//                if(i>=400){
//                    System.out.println(attributeName +" : is broken");}
//                else{
//                    System.out.println(attributeName +" : is not broken");
//                }
//            }
//        }
        Thread.sleep(3000);
        driver.quit();
    }
}
