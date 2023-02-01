package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

class fileUploadDoc {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement uploadElement = driver.findElement(By.name("file"));
//        uploadElement.click();
        uploadElement.sendKeys("C:\\Users\\HHRA1231\\Desktop\\Desktop\\G1.png");
        driver.findElement(By.id("file-submit")).submit();
        if (driver.getPageSource().contains("File uploaded!")){
            System.out.println("File uploaded");
        } else {
            System.out.println("File not uploaded");
        }
        driver.quit();
    }
}
