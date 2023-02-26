package TeamWork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

public class C10 extends TestBase {
    @Test
    public void Test01(){
        //https://ultimateqa.com/simple-html-elements-for-automation/ sayfasina gidin
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
        //" HTML Table with unique id" baslikli WebTable da bulunan butun datalari yazdirin ve data
        // sayisinin 10 dan az oldugunu test edin
        Actions actions=new Actions(driver);
        WebElement uniqueId=driver.findElement(By.xpath("//h2[text()='HTML Table with unique id']"));
        actions.scrollToElement(uniqueId).perform();

        // Automation Testing Architect mesleginin salary bilgisini yazdirin
        List<WebElement> table=driver.findElements(By.xpath("//div[@class='et_pb_module et_pb_text et_pb_text_3  et_pb_text_align_left et_pb_bg_layout_light']"));

        int no=1;
        for (WebElement eachElement:table
             ) {
            System.out.println(no+" : "+eachElement.getText());
            no++;
        }

        // salary in $110,000+ daha yuksek oldugunu test edin
        bekle(2);
        //driver.close();
    }
}
