package day02_webelements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class C06_AutomationExcercise {
    public static void main(String[] args) throws InterruptedException {
      /*  1- Bir test class’i olusturun ilgili ayarlari yapin




        6- Sayfayi kapatin*/
        WebDriver driver=new ChromeDriver();
       // 2- https://www.automationexercise.com/ adresine gidin

        driver.get("https://www.automationexercise.com");


        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> amazonLinksWitTagA=driver.findElements(By.tagName("a"));

        int expectedLinkSayisi=147;
        int actualLinkSayisi=amazonLinksWitTagA.size();
        if (expectedLinkSayisi==actualLinkSayisi) {
            System.out.println(amazonLinksWitTagA.size()+"LinkSayisiTesti Passed");
        }else {
            System.out.println("Linksayisi test failed");
        }
        //4- Products linkine tiklayin
        driver.findElement(By.partialLinkText("Products")).click();

        //5- special offer yazisinin gorundugunu test edin
        WebElement specialOffer=driver.findElement(By.id("sale_image"));
        if(specialOffer.isDisplayed()){
            System.out.println("Special offer test Passed");
        }else {
            System.out.println("Special Offer Test failed");
        }

        Thread.sleep(3000);

    }
}
