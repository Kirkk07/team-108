package TeamWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) throws InterruptedException {

        //2. Navigate to url 'http://automationexercise.com'





        //8. Verify that 'Logged in as username' is visible
        //9. Click 'Delete Account' button
        //10. Verify that 'ACCOUNT DELETED!' is visible

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. Launch browser

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement logo=driver.findElement(By.xpath("//div[@class='logo pull-left']"));
        if(logo.isDisplayed()){
            System.out.println("Logo Test Passed");
        }else {
            System.out.println("Logo Test Failed");
        }

        //4. Click on 'Signup / Login' button
        WebElement login= driver.findElement(By.xpath(" //a[@href='/login']"));
        login.click();
        Thread.sleep(2000);

        //5. Verify 'Login to your account' is visible

        WebElement Login= driver.findElement(By.xpath("//*[text()='Login to your account']"));
        if(Login.isDisplayed()){
            System.out.println("Login test Passed");

        }else {
            System.out.println("Login test Failed");
        }

        //6. Enter correct email address and password

        WebElement mail=driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        //mail.click();
        mail.sendKeys("hasankorpe1999@gmail.com");
        WebElement pass=driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        //pass.click();
        pass.sendKeys("zamazingo");

        //7. Click 'login' button
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

        //8. Verify that 'Logged in as username' is visible








    }
}
