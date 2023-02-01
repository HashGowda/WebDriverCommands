package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.openqa.selenium.Keys.TAB;

public class HandleTabs {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        String tableId = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.tutorialspoint.com/index.htm");
        driver.switchTo().window(tableId);
        System.out.println("Tab numbers : "+driver.getWindowHandles().size());

        for (String windowHandle:driver.getWindowHandles()){
            System.out.println("Tab ID : "+windowHandle);
        }

        driver.quit();
    }
}
