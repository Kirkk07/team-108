package TeamWork;

import org.openqa.selenium.By;
import utilities.TestBase;

public class C00_Get extends TestBase {
    public  String getData(int satirNo,int sutunNo){
        //3. satir 5.sutundaki bilgiyi getir.

        String dataXpath="//tbody/tr["+ satirNo + "]/td["+ satirNo +"]";
        String istenenData=driver.findElement(By.xpath(dataXpath)).getText();
        return  istenenData;



    }
}
