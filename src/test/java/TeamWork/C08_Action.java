package TeamWork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.security.Key;

public class C08_Action extends TestBase {
     @Test
    public void test(){
        //1- https://the-internet.herokuapp.com/context_menu sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");
        //2- cizgili alan uzerine sag click yapin ve alerti onaylayin
         WebElement cizgiliAlan= driver.findElement(By.id("hot-spot"));
         Actions action=new Actions(driver);
         action.contextClick(cizgiliAlan).perform();
         driver.switchTo().alert().accept();
        //3- ana sayfade "Context Menu" yazdigini test edin
         String ecpectedYazi="Context Menu";
         String actualYazi=driver.findElement(By.tagName("h3")).getText();
         Assert.assertTrue(actualYazi.contains(ecpectedYazi));
         String ilkSayfaWHD=driver.getWindowHandle();

        //4- ikinci bir sayfada youtub a gidin
         driver.switchTo().newWindow(WindowType.WINDOW);
         driver.get("https://youtube.com");
         String yTubeWHD=driver.getWindowHandle();
         driver.findElement(By.xpath("//button[@aria-label='Reject the use of cookies and other data for the purposes described']")).click();
        //5- arambolumunde "Java" aratin cikan videolarin baslik kismind a"String" ifadesi bulundugunu testedin
        // WebElement searchboxx=driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
         WebElement aramaBox=driver.findElement(By.xpath("//input[@name='search_query']"));
         aramaBox.click();
         aramaBox.sendKeys("boeing  747"+ Keys.ENTER);

         //WebElement searchbox=driver.findElement(By.xpath("//input[@aria-label='Search']"));
         //searchboxx.click();
        // searchboxx.sendKeys("Boeing"+Keys.ENTER);

        //6-https://demoqa.com/droppable adersine gidin ve Accept boumune tiklayin ve
        //7- accepttable elementini drop here bolume surukleyin ve cikan yazinin "Dropped"! oldugunu test edin
        //8 - youtube don ve ana sayfada youtube amnblemi gozuktugunu test et
        //9- baslangic sayfamiza donup test islemini tamamlayiniz


    }
}
