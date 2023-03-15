package Base;

import org.openqa.selenium.WebDriver;

public class DriverPage {
    private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    public static WebDriver getDriver(){
        return dr.get();
    }

    public static void setDriver(WebDriver driver){
        dr.set(driver);
    }
}
