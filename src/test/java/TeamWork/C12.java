package TeamWork;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C12 extends TestBase {
    @Test
    public void Test(){
        //https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login adrtesine git
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        //bank maneger login butonuna tikla
        driver.findElement(By.xpath("//*[text()='Bank Manager Login']")).click();
        //costumer bolumne tiklayin ve butun bilgileri yaydirin, "	E55555" posta lodlu musterinin oldugunu test edin
        driver.findElement(By.xpath("//button[@ng-class='btnClass3']")).click();

        WebElement customers= driver.findElement(By.xpath("//tbody"));
        System.out.println(customers.getText());
        String expectedPk="E55555";
        Assert.assertTrue(customers.getText().contains(expectedPk));
        //bir geri gelin
        driver.navigate().back();
        // ad costumer bolumene tilayin
        driver.findElement(By.xpath("//button[@ng-class='btnClass1']")).click();
        // acilan pencerede ilgili yerlerie fake bilgiler ekleyin
        WebElement fName=driver.findElement(By.xpath("//input[@ng-model='fName']"));
       Actions actions=new Actions(driver);
       /* Faker faker=new Faker();
        actions.click(fName).sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                        .sendKeys(Keys.ENTER).perform();*/
       actions.click(fName)
        .sendKeys("Kirk")
                .sendKeys(Keys.TAB)
                .sendKeys("Hammet")
                .sendKeys(Keys.TAB)
                .sendKeys("5564")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();
       driver.switchTo().alert().accept();
       driver.navigate().forward();
        driver.findElement(By.xpath("//button[@ng-class='btnClass3']")).click();
        WebElement customerss= driver.findElement(By.xpath("//tbody"));
        System.out.println(customerss.getText());

        bekle(5);


        // musteri bilgi listesini tekrar yazdirin ve eklediginiz yeni musterinin listede oldugunu test edin
        //driver.close();
    }
}