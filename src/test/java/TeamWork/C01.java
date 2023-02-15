package TeamWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {

        public static void main(String[] args) throws InterruptedException {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            // www.trendyol.com adresine gidin
            driver.navigate().to("https://www.apple.com");
            // sayfanin title ni getirin
            System.out.println(driver.getTitle());
            // search bolumunde
          /*  WebElement searchbox= driver.findElement(By.xpath("//div[@class='country-select']"));
            searchbox.click();*/

         /*   WebElement bolgesec=driver.findElement(By.xpath("//option[@value='TR']"));
            bolgesec.click();*/

           /* WebElement select=driver.findElement(By.xpath("//*[@id=\"country-selection\"]/div/div/div[2]/div[4]/button"));
            select.click();*/

            //Apple Watch Ultra aratin
            WebElement aramaBolumu=driver.findElement(By.xpath("//*[@id=\"header-wrapper\"]/div/div[1]/input"));
            aramaBolumu.sendKeys("Apple Watch Ultra"+ Keys.ENTER);

            // fiyat bilgisini getirin
            WebElement onerilenKismi= driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[1]/div[2]/select"));
            onerilenKismi.click();

            WebElement enUcuz=driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[1]/div[2]/select/option[2]"));
            enUcuz.click();



            WebElement enucuzSaat=driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[3]/div[1]/div/div[4]/div[1]/a/div[1]/div[2]/div[2]]"));
            enucuzSaat.click();

        String fiyats=driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[1]/div/div/div[5]/div[2]/div/span[2]")).getText();


        System.out.println("Trendyol saat fiyati : "+fiyats);


        // butce 26.000 tl eger bu fiyattan dusukse sepete ekle.*/
            WebElement sepet=driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[4]/button/div[1]"));
            sepet.click();

        String butce="26000";
        if (Integer.parseInt(fiyats)<Integer.parseInt(butce)){
            sepet.click();



        }else{
            System.out.println("Bu saati almak icin para yetersiz");
        }

            Thread.sleep(5000);


            // driveri kapatin
            driver.quit();
    }
}
