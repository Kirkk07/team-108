package day01_SeleniumaGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","Drivers/chromedriver_win32/chromedriver.exe");
           /*
            jar dosyalarini yukleyerek Selenium'u kullanilir hale getirdik
            ancak her bir class'in hangi browser ile calismasini istiyorsak
            o browser ile ilgili driver'i class'da tanimlamamiz lazim
            browser ile ilgili tercihimiz dogrultusunda
            ilgili ayarlari yapmak icin Java'daki System class'indan
            setProperty() kullanilir
            method'a 2 parametre ekleyecegiz
            1.parametre herkes icin ayni : webdriver.chrome.driver
            2.parametre bu driver'in dosya yolu
              herkesin bilgisayarinda farkli olabilir
              windows bilgisayarlarda sonunda .exe yazilmalidir
              mac'lerde .exe olmaz
         */

        /*
        Bir projede selenium ile otomasyon yapabilmek icin
        projeye 2 sey eklemeliyiz
        1- Selenium kutuphanesi
        2- kullanmak istedigimiz browser(lar)in selenium driver'i
          (Biz sadece chrome kullanip sonra daha gelismis framework'lere gecis yapacagiz)
        dosyalari projeye eklemek icin
        1- selenium dev sayfasindan dosyalari bilgisayarimiza indiriyoruz
        2- bunlari unzip yapip, projemizde olusturdugumuz drivers klasorune tasiyoruz
        3- projeye selenium kutuphanelerini (jar dosyalarini) ekliyoruz
     */

        WebDriver driver = new ChromeDriver();
        // istenen sayfaya gitmek icin
        driver.get("https://www.wisequarter.com");
        Thread.sleep(3000);
        driver.close();
    }
}
