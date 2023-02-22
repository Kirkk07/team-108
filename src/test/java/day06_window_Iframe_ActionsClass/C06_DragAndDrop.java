package day06_window_Iframe_ActionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C06_DragAndDrop extends TestBase {
    @Test
    public void Test01(){
     //  1- https://demoqa.com/droppable adresine gidelim
        driver.get("https://demoqa.com/droppable");
     //  2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
        WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action=new Actions(driver);

        action.dragAndDrop(drag,drop).perform();


     //  3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin
        String ecpectedYazi="Dropped!";
        String actulaYazi=driver.findElement(By.xpath("//*[text()='Dropped!']")).getText();
        Assert.assertEquals(ecpectedYazi,actulaYazi);

    }
}
