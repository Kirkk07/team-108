package day05_assertions_dropdownMenu;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C05_TestBaseIlkTest extends TestBase {
    @Test
    public void amazonTest(){
        //amazona gidelim
        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//span[@class='a-button a-spacing-top-base a-button-base glow-toaster-button glow-toaster-button-dismiss']")).click();

        //Nutella aratalim
        driver.findElement(By.id("twotabsearchtextbox"));
        //sonuclari goruntuleyelim.
        WebElement actualSonucYaziElementi=driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String expectedSonucYazi="Nutella";
        String actualSonucYazi=actualSonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazi.contains(expectedSonucYazi));
    }

}
