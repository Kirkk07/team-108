package day07_actionClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01_MoveElement extends TestBase {
    @Test
    public void Test01(){
        //1- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");

//2- Sag ust bolumde bulunan "Account & Lists" menusunun acilmasi icin
//   mouse'u bu menunun ustune getirin
        WebElement accountListElementi= driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
        Actions action=new Actions(driver);
        action.moveToElement(accountListElementi).perform();
        bekle(2);
//3- "Create a list" butonuna basin
        driver.findElement(By.xpath("//*[text()='Create a List']")).click();
        bekle(2);

        //4- Acilan sayfada "Your Lists" yazisi oldugunu test edin
        WebElement yourList=driver.findElement(By.xpath("//li[@id='my-lists-tab']"));
        String expectedList="Your Lists";
        String actualList= yourList.getText();
        Assert.assertEquals(expectedList,actualList);

    }

}
