package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {

    public static void main(String[] args) {
//        explicitlyWait();
        implicitlyWait();
    }

    public static void explicitlyWait (){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com/ncr");

        driver.findElement(By.name("q")).sendKeys("cheese"+ Keys.ENTER);

        //Initialize and wait till element (link) became clickable - timeout in 10 seconds
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));

        //Print the first result
        System.out.println(firstResult.getText());

        driver.quit();
    }

    public static void implicitlyWait(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com/ncr");
//        driver.findElement(By.xpath("//div[text()='Accept all']"));
        driver.findElement(By.name("q")).sendKeys("cheese"+Keys.ENTER);
        driver.findElement(By.xpath("//a/h4"));
        driver.close();
    }
}

