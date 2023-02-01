package WebDriverCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(3000);

        driver.findElement(By.id("input")).sendKeys("Web Automation");
        Thread.sleep(2000);

        String title = driver.getTitle();
        System.out.println("The title is "+title);
        Thread.sleep(2000);

        String CurrentURL = driver.getCurrentUrl();
        System.out.println("The current URL is "+CurrentURL);
        Thread.sleep(2000);

//        String PageSource = driver.getPageSource();
//        System.out.println("The page source is "+PageSource);
//        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
