package TeamWork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class C07 extends TestBase {
    @Test
    public void test01(){
        // amazon adresine git.
        driver.get("https://amazon.com");
        driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();
        //Tum katogoriler kismini locate et. click() yap.

        WebElement ddm= driver.findElement(By.id("searchDropdownBox"));
        ddm.click();
        Select select=new Select(ddm);
        //Bulunan icerigin sayisini ve listesini yazdir.
        System.out.println("DDM BASLIKLARI : "+select.getOptions().size());

        List<WebElement> icerikList=select.getOptions();
        int no=0;
        for (WebElement eachElement: icerikList
             ) {
            System.out.println(no+"=-=-=-="+eachElement.getText());
            no++;
        }
        //Listede Software olup olmadigini kontrol et.
        String expected="Software";
        select.selectByVisibleText("Software");
        String actual=select.getFirstSelectedOption().getText();
        Assert.assertEquals(expected,actual);

        //  index 10 urunu getir. ile arama yap.
        System.out.println("Indexi 10 olan urun.: "+select.getOptions().get(10).getText());



    }
    @Test
    public void Test02(){
        //  elekteronik bolumunu secip arama boumue Macbook yazip sonuclari pahalidan ucuza seklind esiralip
        driver.get("https://amazon.com");
        driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();
        //Tum katogoriler kismini locate et. click() yap.

        WebElement ddm= driver.findElement(By.id("searchDropdownBox"));
        ddm.click();
        Select select=new Select(ddm);
        select.selectByVisibleText("Electronics");
        select.getFirstSelectedOption().click();
        WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("Macbook"+ Keys.ENTER);
        WebElement siralama=driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));

        Select select1=new Select(siralama);
        select1.selectByVisibleText("Price: High to Low");
        select1.getFirstSelectedOption().click();
        WebElement price=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none a-spacing-top-micro s-price-instructions-style'])[1]"));
        System.out.println(price.getText());
        String pri=price.getText();
        String[] arrreg=pri.split("//D");




        //  en pahali urunun 40000 tlden daha yuksek oldunu test edin
    }


}
