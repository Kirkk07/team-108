package day04_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Before_AfterClass {




    //Eger bir test methodu'u icin driver olusturup, sonunda kapatmamiz gerekmiyorsa
    //class'in basinda birkez driver olusturup, class'in sonunda driveri kapatabiliriz.
    //Beforeclass ve After Class notasyonu kullanan methodlar Static Olmalidir.

    // 3 test method'u olusturun
    // Aradan bir testi Atlamak istersek @Ignore diyebiliriz @ Test Basliginin yanina.
    static WebDriver driver;
    @BeforeClass
    public static void  setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public static void  teardown(){
        driver.close();
    }
    @Test
    // 3.Ilk urune tiklayip, urun isminde Nutella gectigini test edin
    // 1.amazon anasayfaya gidip, amazona gittiginizi test edin
    public void test01(){
        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//span[@class='a-button a-spacing-top-base a-button-base glow-toaster-button glow-toaster-button-dismiss']")).click();

        String expectedIcerik="amazon";
        String actualicerik=driver.getCurrentUrl();

        if (actualicerik.contains(expectedIcerik)){
            System.out.println("Amazon testi Passed");
        }else {
            System.out.println("Url Amazaon testi failed");
        }

    }
    // 2.Nutella aratip arama sonuclarinin nutella icerdigini test edin

    @Test
    public void test02(){
        WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("Nutella", Keys.ENTER);

        WebElement searchresultElement= driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String expectedIcerik="Nutella";
        String actualIcerik=searchresultElement.getText();
        //System.out.println(actualIcerik);
        if (actualIcerik.contains(expectedIcerik)){
            System.out.println("Amazon Icerik testi Passed");
        }else {
            System.out.println("Icerik Amazaon testi failed");
        }

    }

    // 3.Ilk urune tiklayip, urun isminde Nutella gectigini test edin
    @Test @Ignore //Ignore ettik
    public void test03(){

        WebElement ilkUrun=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
        ilkUrun.click();
        WebElement urunisimElementi= driver.findElement(By.xpath("//span[@id='productTitle']"));

    }
}
