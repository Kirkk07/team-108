package day06_window_Iframe_ActionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_SwtichWindows  extends TestBase {
    @Test
    public void Test01(){
        //amazon anasayfaya gidin.arama kutusunun erisilebil oldugunu tespit edin

        // yeni bir tab olarak wiseQuarter.com'a gidin.
        // url'nin wisequarter icerdigini tespit edin.

        //amazon'un acik oldugu tab'a geri donup
        //Nutella icin arama yapin.
        //Sonuclarin Nutella icerdigini tespit edin.

        // Yeni bir window olarak youtube.com'a gidin
        //Url'nin youtube icerdigini tespit edin.

        //Wisequarterin acik oldugu sayfaya donun
        // Titlein Wisequarter icerdigini test edin.
        driver.get("https://www.amazon.com");
        WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(searchbox.isEnabled());
    }
}
