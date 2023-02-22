package day07_actionClass_fileTestleri;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_KeywordActions extends TestBase {
    @Test
    public void Test01(){
        // 2- https://www.amazon.com sayfasina gidelim
        driver.get("https://amazon.com");

       // 3- Arama kutusuna actions method’larine kullanarak Samsung A71 yazdirin ve Enter’a basarak arama yaptirin
        WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));

        Actions action=new Actions(driver);
        action.click(searchbox).keyDown(Keys.SHIFT).
                sendKeys("s").
                keyUp(Keys.SHIFT).sendKeys("amsung ")
                .keyDown(Keys.SHIFT).sendKeys("a")
                .keyUp(Keys.SHIFT).sendKeys("71").sendKeys(Keys.ENTER).perform();
       // 4- aramanin gerceklestigini test edin
        String sonucAramaYazisi=driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")).getText();
        String expected ;
    }
}
