package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {

    public static void main(String[] args) throws InterruptedException {
        /* En ilkel haliyle bir otomasyon yapmak icin
           Class'imiza otomasyon icin gerekli olan webdriver'in yerini gostermemiz gerekir
           bunun icin Java kutuphanesinden System.setProperty() methodu kullaniriz
           method 2 parametre istemektedir
           ilki kullanacagimiz driver : webdriver.chrome.driver
           ikincisi ise bu driverin fiziki yolu :
         */
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.techproeducation.com");
        Thread.sleep(2000);
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        //driver.close();
    }
}
