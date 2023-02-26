package TeamWork;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

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
    public void Test02() throws InterruptedException {
    //https://ultimateqa.com/
    driver.get("https://ultimateqa.com/");
    WebElement learning = driver.findElement(By.linkText("Learning"));

    Actions actions = new Actions(driver);
    actions.moveToElement(learning).perform();
    WebElement auex = driver.findElement(By.linkText("Automation Exercises"));
    auex.click();
    WebElement fill = driver.findElement(By.linkText("Fill out forms"));
    fill.click();
    WebElement name = driver.findElement(By.id("et_pb_contact_name_0"));
    name.click();



    WebElement capt= driver.findElement(By.xpath("//span[@class='et_pb_contact_captcha_question']"));
    System.out.println(capt.getText());
    String islem=capt.getText();
    String[] arr=islem.split(" ");
    System.out.println(Arrays.toString(arr));
    int sonuc= parseInt(arr[0])+parseInt(arr[2]);
    System.out.println(sonuc);
    String s=Integer.toString(sonuc);


    WebElement ilkbilgiKutusu=driver.findElement(By.id("et_pb_contact_name_0"));


    Faker fake = new Faker();
    actions.contextClick(name)
            .sendKeys(fake.name().fullName())
            .sendKeys(Keys.TAB)
            .sendKeys(fake.lorem().characters()).sendKeys(Keys.TAB)
            .sendKeys(Keys.ENTER)
            .sendKeys(Keys.TAB)
            .sendKeys(fake.name().fullName())
            .sendKeys(Keys.TAB)
            .sendKeys(fake.lorem().characters())
            .sendKeys(Keys.TAB)
            .sendKeys(s)
            .sendKeys(Keys.TAB)
            .sendKeys(Keys.ENTER).perform();
    WebElement yazi1= driver.findElement(By.xpath("(//*[text()='Thanks for contacting us'])[1]"));
    String syazi1=yazi1.getText();
    WebElement yazi2= driver.findElement(By.xpath("(//*[text()='Thanks for contacting us'])[2]"));
    String syazi2=yazi2.getText();

    //Assert.assertTrue(syazi1.contains(expectedCikti) &syazi2.contains(expectedCikti));



    // adresine gidin Learning blolumunun uzerine gelip Automation bolumunu secin
    // acilan sayfada fill out forms bolumune tiiklayin
    // name ve message bolumleirne fake bilgilera isleyin ve submit yapin yapilan islemin basarili oldugunu test edin








}}
