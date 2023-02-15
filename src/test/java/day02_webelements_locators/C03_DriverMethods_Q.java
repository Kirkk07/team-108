package day02_webelements_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverMethods_Q {
    public static void main(String[] args) throws InterruptedException {


    //1.Yeni bir class olusturalim (Homework)
    //2.ChromeDriver kullanarak, facebook sayfasina gidin ve

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com");

    // sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify),
    // degilse dogru basligi yazdirin.

        String ecpectedTitle="Facebook";
        String actualTitle=driver.getTitle();
        if (actualTitle.equals(ecpectedTitle)){
            System.out.println("FacebookTitle test Passed");
        }else {
            System.out.println("FacebookTitle test Failed-"+" -Dogru Title: "+driver.getTitle());
        }

    //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin,
    //icermiyorsa “actual” URL’i yazdirin.

        String ecpectedUrl="facebook";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(ecpectedUrl)){
            System.out.println("Facebook Url test Passed");
        }else {
            System.out.println("Facebook Url test Failed");
        }
        Thread.sleep(4000);
    //4.https://www.walmart.com/ sayfasina gidin.

        driver.get("https://www.walmart.com");
        Thread.sleep(4000);

    //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.

        String wallecpectedTitle="Facebook";
        String wallactualTitle=driver.getTitle();
        if (wallactualTitle.equals(wallecpectedTitle)){
            System.out.println("Wallmart Title test Passed");
        }else {
            System.out.println("WallMart Title test Failed-"+" -Dogru Title: "+driver.getTitle());
        }
    //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        Thread.sleep(2000);
    //7. Sayfayi yenileyin

        driver.navigate().refresh();
        Thread.sleep(2000);

    //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
    //9.Browser’i kapatin
        Thread.sleep(4000);
        driver.close();

    }
}
