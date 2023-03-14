package TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory {


    //create webDriver object for given browser
public WebDriver createBrowserInstance(String browser){
    WebDriver driver=null;

    if (browser.equalsIgnoreCase("Chrome")){

        WebDriverManager.chromedriver().setup();
        ChromeOptions opt= new ChromeOptions();
        opt.addArguments("--incognito");
        driver = new ChromeDriver(opt);

    } else if (browser.equalsIgnoreCase("firefox")) {

        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions fOpt = new FirefoxOptions();
        fOpt.addArguments("-private");
        driver = new FirefoxDriver(fOpt);

    } if (browser.equalsIgnoreCase("ie")){

        WebDriverManager.edgedriver().setup();
        EdgeOptions eOpt = new EdgeOptions();
        eOpt.addArguments("-private");
        driver = new EdgeDriver(eOpt);
    }

    return driver;
}

}
