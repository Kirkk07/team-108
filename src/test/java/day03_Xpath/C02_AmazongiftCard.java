package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_AmazongiftCard {
    public static void main(String[] args) {



       // 4- Sayfayi “refresh” yapin




       // 9- Gift card details’den 25 $’i secin
       // 10-Urun ucretinin 25$ oldugunu test edin
       // 11-Sayfayi kapatin
        // 1- bir class olusturun
        WebDriver driver=new ChromeDriver();  // 3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");


        // 5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedtitle="Spend less";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(expectedtitle)){
            System.out.println("Title Test passed");
        }else{
            System.out.println("Title Test Failed");
        }
        // 6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("//span[@class='a-button a-spacing-top-base a-button-base glow-toaster-button glow-toaster-button-dismiss']")).click();
        driver.findElement(By.cssSelector("a[data-csa-c-slot-id='nav_cs_3']")).click();

        // 7- Birthday butonuna basin
        driver.findElement(By.cssSelector("a[aria-label='Birthday']")).click();

        // 8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]")).click();

        // 9- Gift card details’den 25 $’i secin
        driver.findElement(By.cssSelector("#gc-mini-picker-amount-1")).click();
        WebElement price= driver.findElement(By.cssSelector("#gc-live-preview-amount"));
        String expectedPrice="25$";
        String actualPrice=price.getText();
        if(actualPrice.equals(expectedPrice)){
            System.out.println("Price Test Passed");
        }else{
            System.out.println("Price Test Failed");
            System.out.println("Price: "+actualPrice);
        }
        // 10-Urun ucretinin 25$ oldugunu test edin

    }
}
