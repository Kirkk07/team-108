package day08_ecplicitlyWait_cookies_WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class C01_EcplicitlyWait {
    @Test
    public  void test01(){
        /*
        Implicitly wait test yaparken ihtiyaclarin cogunu halleder.
        Nadiren de olsa bazi islemler icin implicitlyWait icin tanimlanan sureden daha fazla zamana
        ihtiyac duyar.
        Bazen indirme ismleri upload islemleri 15 saniyeden uzun surebilir.
        Sadece bir islem icin implicitly waiti 15 ten buyuk tutarak diger islemlerin de uzun
        sure tanimlanmasina gerek yoktur.
        Bu tarz durumlarda sadece 1 islem icin kullanabilecegimiz EcplicitlyWait bu sekilde tanimlanir.
        Implicitlywait Butun element ve butun locateler icin
        EcplixitlyWait sadece tanimlanmis webelement ve gorev.

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //4. Remove butonuna basin.
        driver.findElement(By.xpath("//*[text()='Remove']")).click();
        //5. “It’s gone!” mesajinin goruntulendigini dogrulayin.
        // explicitlyWait Kullanacaksak
        //A bir wait objesi olusturmaliyiz
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
         // B - Eger kullanacagimiz webelemet locate edilebilir ise locate yapalim.

        //WebElement itsGoneElementi=
               // driver.findElement(By.xpath("//p[@id='message']"));

        //Eger locate etmemiz icin zaman ihtiyac varsa,
        //Locate ve gorev tanimlamayi tek satirda yapiyoruz.
        WebElement itsGoneElementi=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        Assert.assertTrue(itsGoneElementi.isDisplayed());
        driver.close();
    }
}
