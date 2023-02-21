package TeamWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class C05_TestCases02_Login {
    static WebDriver driver;
    @BeforeClass
            public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://automationexercise.com");
    }
    @Test
            public void test01(){
        driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("kirk@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("ucunkuslarucun");
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
    }

    @AfterClass
            public static void teardown() throws InterruptedException {

        Thread.sleep(2100);
        driver.findElement(By.xpath("//*[text()=' Logout']")).click();

        Thread.sleep(2007);
        driver.close();
    }



}
