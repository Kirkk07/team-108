package day02_webelements_locators;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_Findelements {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");

        WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("java");
        searchbox.submit();

        //arama sonucclarinda cikan resimlerdeki yazilari yazdirin.

        List<WebElement> aramasonuclariElementList=driver.findElements(By.className("sg-col-inner"));
        System.out.println("aramasonuclariElementList.size(): "+ aramasonuclariElementList.size());

        // bu 85 elementi yazdirin.

        int elementno=-1;
        for (WebElement eachElement:aramasonuclariElementList
             ) {
            System.out.println(elementno+"--------"+eachElement.getText());
            elementno++;

        }

        Thread.sleep(3000);
        driver.close();
    }
}
