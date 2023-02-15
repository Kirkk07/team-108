package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_XpathText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // 3- Delete butonu’nun gorunur oldugunu test edin
        // 4- Delete tusuna basin
        // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna basin
        WebElement add = driver.findElement(By.xpath("//*[text()='Add Element']"));
        add.click();
        Thread.sleep(3000);
        // 3- Delete butonu’nun gorunur oldugunu test edin
        WebElement delete = driver.findElement(By.xpath("//*[text()='Delete']"));
        if (delete.isDisplayed()) {
            System.out.println("DeleteButtun test Passed");

        } else {
            System.out.println("deleteButton test Failed");
        }

        // 4- Delete tusuna basin
        delete.click();

        // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement AddRemoveElements = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (AddRemoveElements.isDisplayed()) {
            System.out.println("AddRemoveElements test Passed");

        } else {
            System.out.println("AddRemoveElements test Failed");
        }
        Thread.sleep(3000);
    }
}
