package Practice;

import com.fasterxml.jackson.annotation.JsonValue;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ScrollDown {

//    public static void main(String[] args) {
//        WebDriver driver;
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        driver.manage().window().maximize();
//
//        //Launch the application
//        driver.get("https://www.youtube.com/");
//
//        //To scroll down on a web page in Selenium by defining the number of pixels
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript(("window.scrollBy(0, 1000)"));
//
//        driver.close();
//    }
//}

//To scroll down to an element in Selenium until it is visible

//        WebDriver driver;
//        @Test
//        public void byVisibleElement(){
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            driver.manage().window().maximize();
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//
//                //Launch the application
//                driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
//
//                //Locating the element
//                WebElement element = driver.findElement(By.linkText("Try Selenium Testing For Free"));
//
//                //Scrolling down the page till the element is found
//                js.executeScript("arguments[0].scrollIntoView();", element);
//
//                driver.quit();


    //to scroll down to the bottom of the webpage using Selenium

    @Test
    public void scrolldown(){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");

        //To perform scroll on an application using selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");

        //driver.quit();
        }
}
