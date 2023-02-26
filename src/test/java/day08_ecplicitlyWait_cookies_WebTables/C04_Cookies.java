package day08_ecplicitlyWait_cookies_WebTables;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class C04_Cookies extends TestBase {
    @Test
    public void Test(){
      // Yeni bir class olusturun : cookiesAutomation
      // 1- Amazon anasayfaya gidin
        driver.get("https://amazon.com");

      // 2- tum cookie’leri listeleyin
        Set<Cookie> cookiesSet=driver.manage().getCookies();
        int sirano=1;
        for (Cookie eachCookie: cookiesSet
             ) {
            System.out.println(sirano+" : "+eachCookie.toString());
        sirano++;
        }

      // 3- Sayfadaki cookies sayisinin 1’den buyuk oldugunu test edin
        Assert.assertTrue(cookiesSet.size()>1);

      // 4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
       String actualValue= driver.manage().getCookieNamed("i18n-prefs").getValue();
       String expectedValue="USD";
       Assert.assertEquals(expectedValue,actualValue);
      // 5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin
        Cookie mijnecookie=new Cookie("en sevdigim cookie","cikolatali");
        driver.manage().addCookie(mijnecookie);
        cookiesSet=driver.manage().getCookies();

        int siranoo=1;
        for (Cookie eachCookie: cookiesSet
        ) {
            System.out.println(siranoo+" : "+eachCookie.toString());
      siranoo++;
        }


      // 6- eklediginiz cookie’nin sayfaya eklendigini test edin
      // 7- ismi skin olan cookie’yi silin ve silindigini test edin
        driver.manage().deleteCookieNamed("skin");
        System.out.println("======");
        //olmayan bir elemani test edemeyiz.
        // bunun yerine for-each loop ile ele aldigimiz her cookiesi test edelim.
        // ismi skin olan varsa Test Fail olsun.
        cookiesSet=driver.manage().getCookies();
        for (Cookie eachCookies:cookiesSet
             ) {
            Assert.assertFalse(eachCookies.getName().equals("skin"));
        }

      // 8- tum cookie’leri silin ve silindigini test edin
        driver.manage().deleteAllCookies();
        cookiesSet=driver.manage().getCookies();
        Assert.assertTrue(cookiesSet.size()==0);
        driver.close();
    }
}
