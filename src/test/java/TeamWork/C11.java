package TeamWork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class C11 extends TestBase {
    @Test
    public void Test01(){
      //  Bir Class olusturun D19_WebtablesHomework
        //  1. “https://demoqa.com/webtables” sayfasina gidin
        driver.get("https://demoqa.com/webtables");

      //  2. Headers da bulunan basliklari yazdirin
       // List<WebElement> headers=driver.findElements(By.xpath("//div[@class='rt-thead -header']"));
        List<WebElement> headers2=driver.findElements(By.xpath("//div[@class='rt-tr']"));
        int no=1;
        for (WebElement eachHe:headers2
             ) {
            System.out.println(no+" : "+eachHe.getText());
            no++;
        }
       /* for (WebElement eachHeader:headers
             ) {
            System.out.println(no+" = "+eachHeader.getText());
            no++;
            System.out.println(headers.size());
        }*/
      //  3. 3.sutunun basligini yazdirin

        WebElement sutun=driver.findElement(By.xpath("(//div[@class='rt-th rt-resizable-header -cursor-pointer'])[3]"));
        System.out.println(sutun.getText()+" 3.sutun: ");

      //  4. Tablodaki tum datalari yazdirin
        List<WebElement> allData= driver.findElements(By.xpath("//div[@role='gridcell']"));
        no=1;
        for (WebElement each:allData
             ) {
            if (!each.getText().isBlank()){
                System.out.println(no+" :  "+each.getText());

                System.out.println(" == ");
                no++;
            }

        }
      //  5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin

      //  6. Tablodaki satir sayisini yazdirin
      //  7. Tablodaki sutun sayisini yazdirin
      //  8. Tablodaki 3.kolonu yazdirin
      //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
      //  10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun
      //  sayisini girdigimde bana datayi yazdirsin
       driver.close();
    }
}
