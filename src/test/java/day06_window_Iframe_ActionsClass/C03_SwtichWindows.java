package day06_window_Iframe_ActionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C03_SwtichWindows  extends TestBase {
    @Test
    public void Test01(){
        //amazon anasayfaya gidin.arama kutusunun erisilebil oldugunu tespit edin

        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();
        String amazonWindowHandleDegeri=driver.getWindowHandle();
        WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(searchbox.isEnabled());


        // yeni bir tab olarak wiseQuarter.com'a gidin.

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://wisequarter.com");

        // url'nin wisequarter icerdigini tespit edin.
        String expectedUrl="https://www.wisequarter.com/";
        String wiseWindowHandleDegeri=driver.getWindowHandle();
        String actualURl=driver.getCurrentUrl();
        Assert.assertTrue(actualURl.contains(expectedUrl));
        //amazon'un acik oldugu tab'a geri donup
         /*
            Daha once acilmis olan bir windowa gecis yapabilmek icin
            O sayfanin windowHandle degerine ihtiyacimiz vardir.

            Testimiz Boyle bir gorevi iceriyorsa osayfada iken WindowHandle degerinin alip kayit yapmaliyiz.

          */
        driver.switchTo().window(amazonWindowHandleDegeri);
        //Nutella icin arama yapin.
        searchbox.sendKeys("Nutella"+ Keys.ENTER);
        //Sonuclarin Nutella icerdigini tespit edin.
        String actualsonucYazisi=driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")).getText();
        String ecpectedIcerik="Nutella";
        Assert.assertTrue(actualsonucYazisi.contains(ecpectedIcerik));

        // Yeni bir window olarak youtube.com'a gidin
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://youtube.com");
        //Url'nin youtube icerdigini tespit edin.
        String expectedIcerik="youtube";
        String actualIcerik=driver.getCurrentUrl();
        Assert.assertTrue(actualIcerik.contains(expectedIcerik));

        // wisequarter'in acik oldugu sayfaya donun
        driver.switchTo().window(wiseWindowHandleDegeri);
        // Title'in Wise Quarter icerdigini test edin
        expectedIcerik="Wise Quarter";
        String actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedIcerik));
        bekle(3);

    }
}
