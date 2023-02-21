package TeamWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06 {

        static WebDriver driver;

        @BeforeClass
        public static void setup(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        @AfterClass
        public static void teardown(){
            System.out.println("Test surecleri tamamlanmistir");
            driver.close();
        }

        @Before
        public  void testStart(){
            driver.manage().window().fullscreen();
            driver.get("https://www.amazon.com");
        }
        @After
        public  void testEnd(){
            System.out.println("Test parcali adimlari tamamlanmistir");
        }
        //Test Case 7: Verify Test Cases Page
        @Test
        public void test01(){
            //1. Launch browser
            //2. Navigate to url 'http://automationexercise.com'
            driver.navigate().to("http://automationexercise.com");
            //3. Verify that home page is visible successfully
            WebElement homeYazisi=driver.findElement(By.xpath("//a[text()=' Home']"));
            String actualDurum= homeYazisi.getAttribute("style");
            System.out.println(actualDurum);
            String expectedDurum="color: orange;";

            Assert.assertEquals(expectedDurum,actualDurum);
        }

        @Test
        public void test02(){
            //4. Click on 'Test Cases' button
            //5. Verify user is navigated to test cases page successfully
        }



        //6.  https://www.techlistic.com/p/selenium-practice-form.html sayfasina gidiniz
        //7. navigasy0n kisminda bulunan iceriklerin listesini yazdirirn
        //8. icerik icerisinde "Contact" basligi icerip icermedigini test edin
        // 9. bulunnulan sayfada footer bolumunde "Powered by Blogger" yazdigini test ediniz
        //10.driverimiz sayfa gecislerinde kapatilip tekrar acilsin

    }
