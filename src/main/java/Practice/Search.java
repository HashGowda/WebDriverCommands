package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://in.puma.com/in/en");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Mens Shoes"+ Keys.ENTER);
        Thread.sleep(10000);
        driver.quit();
    }
}
