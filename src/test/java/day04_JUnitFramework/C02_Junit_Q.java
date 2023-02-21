package day04_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Junit_Q {
//




//5. Sign in buttonuna tiklayin


//8. tarih kismina “2020-09-10” yazdirin

//10. “The payment was successfully submitted.” mesajinin ciktigini test edin

    //    1. http://zero.webappsecurity.com sayfasina gidin
    @Test
    public  void test01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://zero.webappsecurity.com");

        //            2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();

        //3. Login alanine  “username” yazdirin
        WebElement login=driver.findElement(By.xpath("//input[@id='user_login']"));
        login.sendKeys("username");
        Thread.sleep(2500);

        //4. Password alanine “password” yazdirin
        WebElement pas=driver.findElement(By.xpath("//input[@id='user_password']"));
        pas.sendKeys("password", Keys.ENTER);
        Thread.sleep(2500);
        //Sayfa calismadigi icin 1 kere back tusuna basinca aciliyor.
        driver.navigate().back();


        //6. onlina bankinge gidip Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//a[@id='online-banking']")).click();
        driver.findElement(By.id("pay_bills_link")).click();

        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin

        driver.findElement(By.id("sp_amount")).sendKeys("200");

        //8. tarih kismina “2020-09-10” yazdirin
        driver.findElement(By.id("sp_date")).sendKeys("020-09-10");
        //9. Pay buttonuna tiklayin
        driver.findElement(By.id("pay_saved_payees")).click();

        //10. “The payment was successfully submitted.” mesajinin ciktigini test edin
        WebElement mesajElementi = driver.findElement(By.id("alert_content"));
        if (mesajElementi.isDisplayed()){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
        driver.close();





    }
}
