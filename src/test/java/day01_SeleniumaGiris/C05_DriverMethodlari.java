package day01_SeleniumaGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver","Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.wisequarter.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://www.youtube.com");
        driver.navigate().refresh();
        Thread.sleep(3500);
        driver.close();
    }
}
