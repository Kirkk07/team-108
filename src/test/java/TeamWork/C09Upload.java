package TeamWork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C09Upload extends TestBase {
    @Test
    public void Test(){
        //https://the-internet.herokuapp.com/download
        driver.get("https://the-internet.herokuapp.com/download");
        //LambdaTest elementini indirin indirdiginizi test edin
        driver.findElement(By.xpath("//a[text()='LambdaTest.txt']")).click();
        String filePath="C://Users//hasan//Downloads//LambdaTest.txt";
       Assert.assertTrue(Files.exists(Paths.get(filePath)));
    }
    @Test
    public void Test01(){
        //https://the-internet.herokuapp.com/upload baska bir tabda acin

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseButton=driver.findElement(By.id("file-upload"));
        String DosyaYolu=System.getProperty("user.home")+"//Downloads//LambdaTest.txt";
        chooseButton.sendKeys(DosyaYolu);
        driver.findElement(By.xpath("//input[@id='file-submit']")).click();
        bekle(2);

        String exp="File Uploaded!";
        String axt=driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(exp,axt);
        bekle(2);
        driver.quit();

        // masa ustunde veya download da bulunan bir dosyanin basarili bir sekilde  yuklendigini test edin.


    }
@Test
    public void Test02(){
       //https://ultimateqa.com/
    // adresine gidin Learning blolumunun uzerine gelip Automation bolumunu secin
    // acilan sayfada fill out forms bolumune tiiklayin
    // name ve message bolumleirne fake bilgilera isleyin ve submit yapin yapilan islemin basarili oldugunu test edin


}

}
