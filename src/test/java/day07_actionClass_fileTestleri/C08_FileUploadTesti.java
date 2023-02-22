package day07_actionClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C08_FileUploadTesti extends TestBase {
    @Test
    public void Test01(){
     //  1.https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");
     //  2.chooseFile butonuna basalim
     //  3.Yuklemek istediginiz dosyayi secelim.
        //Biraz once Downloada indirdigimiz logo.pnh dosyaysini yukleyelim.

         /*
         choose file buttonun abasarsak bilgisayrimizdan bir dosya secme islemi yaomamiz gerekir.
         ancak Slenium veya Java bilgisyaramizdan Bilgisayarimizdan Dosya secme islemi
        YApamaz. Bunun yerine Selenium bize bir yontem gelistirmistir,.
        Choose file ile secmemiz gereken Dosyanin, dosya yolunu olusturupolusturulan Dosya yolunu
        Senkd keys ile choose file buttonun gondermemiz yeterli olur.

        */
        String dinamikDosyaYolu=System.getProperty("user.home")+"//Downloads//logo.png";
        WebElement chooseFileButton= driver.findElement(By.id("file-upload"));
        chooseFileButton.sendKeys(dinamikDosyaYolu);
     //  4.Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();
     //  5.“File Uploaded!” textinin goruntulendigini test edelim.
        WebElement FileUploaded=driver.findElement(By.tagName("h3"));
        Assert.assertTrue(FileUploaded.isDisplayed());

    }
}
