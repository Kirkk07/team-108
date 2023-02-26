package day08_ecplicitlyWait_cookies_WebTables;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

public class C05_WebTables extends TestBase {
    @Test
    public void test01(){
       // 1.“https://www.amazon.com” adresine gidin
    driver.get("https://amazon.com");

       // 2.Sayfanin en altina inin
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.END).perform();
        bekle(3);
       // 3.Web table tum body’sini yazdirin
        WebElement tumBody=driver.findElement(By.xpath("//tbody"));
        System.out.println(tumBody.getText());
       // 4.Web table’daki satir sayisinin 9 oldugunu test edin
        List<WebElement> satirlar= driver.findElements(By.xpath("//tbody/tr"));
        Assert.assertTrue(satirlar.size()==9);
        System.out.println("=========================");
       // 5.Tum satirlari yazdirin
        int satirno=1;
        for (WebElement eachSatir:satirlar
             ) {
            System.out.println(satirno+" : "+eachSatir.getText());
            satirno++;
        }
       // 6. Web table’daki sutun sayisinin 13 olduğunu test edin
        List<WebElement> ucuncuSatirDataList=driver.findElements(By.xpath("//tbody/tr[3]/td"));
        System.out.println("===========");
        Assert.assertEquals(13,ucuncuSatirDataList.size());
       // 7. 5.sutunu yazdirin
        List<WebElement> besinciSutunListesi=driver.findElements(By.xpath("//tbody/tr/td[5]"));
        System.out.println("===5. Sutun====");
        satirno=1;
        for (WebElement eachel:besinciSutunListesi
        ) {
            System.out.println(satirno+" : "+eachel.getText());
            satirno++;
        }
       // 8.Satir ve sutun sayisini parametre olarak alip, hucredeki bilgiyi döndüren bir method olusturun
        System.out.println("Istenen Data\n"+getData(3,5));
        // 9- 7.satirin 9 datasinin Shoes icerdigini test ediniz.

        String actualData=getData(7,9);
        System.out.println("====");
        System.out.println(actualData);
        System.out.println("====");
        String expectedIcerik="Shoes";
        Assert.assertTrue(actualData.contains(expectedIcerik));
    }
    public  String getData(int satirNo,int sutunNo){
        //3. satir 5.sutundaki bilgiyi getir.

        String dataXpath="//tbody/tr["+ satirNo + "]/td["+ satirNo +"]";
        String istenenData=driver.findElement(By.xpath(dataXpath)).getText();
        return  istenenData;



    }
}
