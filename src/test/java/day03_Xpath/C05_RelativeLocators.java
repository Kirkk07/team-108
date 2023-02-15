package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_RelativeLocators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        WebElement berlinElementi=driver.findElement(By.xpath("//*[@id='pid7_price']"));
        WebElement NycElementi=driver.findElement(By.xpath("//*[@id='pid3_price']"));
        WebElement bostonElementi=driver.findElement(By.xpath("//*[@id='pid6_price']"));
        WebElement seilorElementi=driver.findElement(By.xpath("//*[@id='pid11_price']"));

    }
}
