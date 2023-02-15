package TeamWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {
    public static void main(String[] args) {

        // 8. Verify all the products related to search are visible

        // 1. Launch browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 2. Navigate to url ''
        driver.navigate().to("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
        // 4. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();

        // 5. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement titleProduct= driver.findElement(By.xpath("//h2[text()='All Products']"));
        if(titleProduct.isDisplayed()){
            System.out.println("Product page is succesfully opened");
        }else {
            System.out.println("Failed");
        }

        // 6. Enter product name in search input and click search button
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='search_product']"));
        searchBox.sendKeys("Polo");
        WebElement submit=driver.findElement(By.xpath("//button[@id='submit_search']"));
        submit.click();

        // 7. Verify 'SEARCHED PRODUCTS' is visible
        WebElement SearcheProduct=driver.findElement(By.xpath("//*[text()='Searched Products']"));
        if (SearcheProduct.isEnabled()){
            System.out.println("Search Product Enabled");
        }else {
            System.out.println("Search Product Failed");
        }

        // 8. Verify all the products related to search are visible
        WebElement pro=driver.findElement(By.xpath("//div[@class='overlay-content']"));
        if (pro.isEnabled()){
            System.out.println("Pro is Enabled");
        }else{
            System.out.println("pro is Failed");
        }








    }
}
