package day01_SeleniumaGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_DriversManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        System.out.println("Maximize Size: "+driver.manage().window().getSize());
        System.out.println("Maximize position: " +driver.manage().window().getPosition());

        driver.manage().window().fullscreen();

        System.out.println("fullScreen Size: "+driver.manage().window().getSize());
        System.out.println("fullScreen position: " +driver.manage().window().getPosition());
        driver.close();

    }
}
