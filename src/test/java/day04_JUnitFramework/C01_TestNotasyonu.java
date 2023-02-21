package day04_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TestNotasyonu {
    WebDriver driver;
    /*
    FrameWork: ortak Calisma Cercevesi
            Hangi dosyalari nerede olusturacagimiz belirler ve boylece calismayi kolaylastirir
            Her FrameWork, dosya duzeni olusturmanin yaninda,
            islerimizi kolasylastiran yeni ozellikler sunmustur.

            JUnit framework en temel test Frameworkudur.
            Bize sagladigi en  onemli ozellik @Test Annotation(notasyondur).

            JUniti mavenden Import ederek her bir Test Methodunu bagimsiz olarak calisitirabilen bir
            Test methodu oldu.
            Java run time bir uglumadir her satiri sirasiyle compile eder
            fakat Junit ile istedigimiz methodu calistiracak sekle getirdik.

     */
    @Before
    public  void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println(" Setup Calisti\");");
    }
    @After
    public void teardown(){
        System.out.println("Teardown Calisti");
        driver.close();
        //Before and after notation can not run by theirself. They have be run with other methods.

    }
    @Test
    public void test01(){
        driver.get("https://www.wisequarter.com");
        System.out.println("Test01 Calisti");

    }
    @Test
    public void test02() {
        driver.get("https://www.youtube.com");
        System.out.println("Test02 Calisti");

    }
}
