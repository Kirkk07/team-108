package TeamWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_TestCases_1 {
    public static void main(String[] args) {
        //Test Case 1: Register User








        //15. Click 'Continue' button
        //16. Verify that 'Logged in as username' is visible
        //17. Click 'Delete Account' button
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully(**)
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();

        //5. Verify 'New User Signup!' is visible
        WebElement signin= driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
        if (signin.isDisplayed()){
            System.out.println("Sign is visible");
        }

        //6. Enter name and email address
        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Kirk Hammet");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("kirk@gmail.com");

        //7. Click 'Signup' button
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible

        //9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("password")).sendKeys("ucunkuslarucun");
        driver.findElement(By.id("days")).sendKeys("25");
        driver.findElement(By.id("months")).sendKeys("September");
        driver.findElement(By.id("years")).sendKeys("2000");

        //10. Select checkbox 'Sign up for our newsletter!'
        //11. Select checkbox 'Receive special offers from our partners!'

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        driver.findElement(By.xpath("//input[@data-qa='first_name']")).sendKeys("Kirk");
        driver.findElement(By.cssSelector("#last_name")).sendKeys("Hammet");
        driver.findElement(By.cssSelector("#address1")).sendKeys("Yozgat Sorgun");
        driver.findElement(By.xpath("//select[@data-qa='country']")).sendKeys("Canada");

        driver.findElement(By.cssSelector("#state")).sendKeys("Misigin");
        driver.findElement(By.cssSelector("#city")).sendKeys("Kentucky");
        driver.findElement(By.cssSelector("#zipcode")).sendKeys("1235");
        driver.findElement(By.cssSelector("#mobile_number")).sendKeys("+15657892541");

        //13. Click 'Create Account button'
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();






        //14. Verify that 'ACCOUNT CREATED!' is visible






    }
}
