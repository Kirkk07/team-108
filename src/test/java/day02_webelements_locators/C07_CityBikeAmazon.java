package day02_webelements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_CityBikeAmazon {
    public static void main(String[] args) {


        /*3- Görüntülenen sonuçların sayısını yazdırın
        4- Listeden ilk urunun resmine tıklayın.*/
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
///*  1- https://www.amazon.com/ sayfasına gidin.
        driver.get("https://amazon.com");
        // 2- Arama kutusuna “city bike” yazip aratin
        WebElement amazonSearchBox= driver.findElement(By.id("twotabsearchtextbox"));
        amazonSearchBox.sendKeys("city bike", Keys.ENTER);
        WebElement sonucYazielementi= driver.findElement(By.className("rush-component"));
        System.out.println(sonucYazielementi.getText());
        WebElement ilkelementi= driver.findElement(By.className("s-image"));
        ilkelementi.click();
    }
}
