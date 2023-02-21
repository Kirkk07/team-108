package day04_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_JunitBestBuy {
  //1) Bir class oluşturun: BestBuyAssertions
  //2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak
  //   asagidaki testleri yapin
  //    ○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
  //    ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
  //    ○ logoTest => BestBuy logosunun görüntülendigini test edin
  //    ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin.
  static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.bestbuy.com/");

    }
    @Test
    public void Test01(){

        String expextedUrl="https://www.bestbuy.com/";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals("Url Test",expextedUrl,actualUrl);
    }
    @Test
    public void Test02(){
        String expectedIcerik="Rest";
        String actualIcerik=driver.getTitle();
        Assert.assertFalse("Title test ",actualIcerik.contains(expectedIcerik));
    }
    @Test
    public void Test03(){
        WebElement logo= driver.findElement(By.xpath("(//img[@class='logo'])[1]"));
        Assert.assertTrue("Logo Test",logo.isDisplayed());

    }
    @Test
    public void Test04(){
        WebElement FrLink=driver.findElement(By.xpath("//*[text()='Français']"));
        Assert.assertTrue("Fr Link test", FrLink.isDisplayed());
    }
    @AfterClass
    public static void teardown(){
        driver.close();
    }

}
