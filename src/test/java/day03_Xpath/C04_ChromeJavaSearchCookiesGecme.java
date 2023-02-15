package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ChromeJavaSearchCookiesGecme {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//*[text()='Alles afwijzen']")).click();
        WebElement searchbox= driver.findElement(By.xpath("//input[@class='gLFyf']"));
        searchbox.sendKeys("javas", Keys.ENTER);
        // bulunan sonuc sayisinin 100binden cok oldugunu test edin
        // About 1.350.000.000 results (0,43 seconds)
        String result=driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
        System.out.println(result);
        String[] resultstr=result.split(" ");
        String resultactual=resultstr[1];
        resultactual.replaceAll("\\D","");

        /*

        WebElement sonucSayiElementi= driver.findElement(By.xpath("//div[@id='result-stats']"));

        String sonucYazisi= sonucSayiElementi.getText();
        String[] sonucYaziArr=sonucYazisi.split(" ");
        String sonucSayisiStr= sonucYaziArr[1]; // 1.350.000.000
        sonucSayisiStr = sonucSayisiStr.replaceAll("\\D","");

        int actualSonucSayisi= Integer.parseInt(sonucSayisiStr);
        int expectedSonucSayisi=100000;
        if (actualSonucSayisi>expectedSonucSayisi){
            System.out.println("Arama sonuc sayisi testi PASSED");
        }else {
            System.out.println("Arama sonuc sayisi testi FAILED");
        }
        driver.close();
         */

    }
}
