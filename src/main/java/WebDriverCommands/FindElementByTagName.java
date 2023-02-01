package WebDriverCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementByTagName {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box/");
        Thread.sleep(2000);

        List<WebElement> allInputElements = driver.findElements(By.tagName("input"));

        if(allInputElements.size()!=0){
            System.out.println(allInputElements.size() +" Elements found by TagName as input \n");

            for(WebElement inputElement:allInputElements){
                System.out.println(inputElement.getAttribute("placeholder"));
            }
        }
        driver.quit();
    }
}
