package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;

public class Deneme {

  //Bir class oluşturun : AmazonSearchTest
  // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

  //a.google web sayfasına gidin. https://www. amazon.com/
  //        b. Search(ara) “city bike”
  //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
  //d. “Shopping” e tıklayın.
  //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");

       WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın

        WebElement site=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));



       // site.getText().split(" ");

        String [] arr=  site.getText().split(" ");

        System.out.println(Arrays.toString(arr));

        System.out.println("aranan sonuc sayi: "+arr[2]);

        //d. “Shopping” e tıklayın.
       WebElement alisveris=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div"));


        alisveris.click();

        WebElement satinal=driver.findElement(By.id("buy-now-button"));

        satinal.click();

        WebElement emaill=driver.findElement(By.id("ap_email"));

        emaill.sendKeys("ramazan5887@googlemail.com"+Keys.ENTER);



    }
}
