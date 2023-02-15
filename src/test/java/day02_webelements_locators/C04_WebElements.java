package day02_webelements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon sayfasina gir
        driver.get("https://www.amazon.com");

        //arama kutusuna locate edip bir webelement olarak kaydedin
        //id"si twotabsearchtextbox olan web element seklinde locate edecegiz.

        /*
        // Drivera webelementi tarif etme islemine locate denir,
        // Bu tarifi yapabilmek icin kullanabilecegim degiskenlere de LOcator denir.

        //  8 Tane Locator vardir.
        -id
        -classname
        -name
        - tagname
        -linktext
        -poriallinkText
        -Geriye kalan  2 locator ise her turlu web elementi locate etmek icin kullanilmaktadir.

        -xpath == En guclusu
        -css
        */

        WebElement amazonSearchbox=driver.findElement(By.id("twotabsearchtextbox"));
        amazonSearchbox.sendKeys("Java");
        amazonSearchbox.submit();

        //arama kutusuna"Nutella" aratin

    }
}
