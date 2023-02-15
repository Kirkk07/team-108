package day01_SeleniumaGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getWindowHandle());

        // selenium tarafindan her fdriver sayfasi icin uretilen
        // unique handledegerlerini dondurur.
        // getWindowsHandels()
        System.out.println(driver.getPageSource());
        // Sayfa kodlarinin icinde "2 hours weekly meeting wit the team" iceriyor mu test
        String expectedicerik="2 hours weekly meeting wit the team";
        String actualSayfaKodlari=driver.getPageSource();

        if (actualSayfaKodlari.contains(expectedicerik)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Failed");
        }
    }
}
