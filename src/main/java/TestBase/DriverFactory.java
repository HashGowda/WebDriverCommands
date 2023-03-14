package TestBase;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    //ThreadLocal --> java.lang --> threading
    //Design Pattern --> represents best practice
    //singleton design pattern - only one instance exist ever, provide local access to that instance by creating getInstance method
    //factory design pattern

    //private constructor so that no one else can create instance of this class
    private DriverFactory(){

    }

    private static DriverFactory inst = new DriverFactory();

    public static DriverFactory getInstance(){
        return inst;
    }

    //Factory design patter --> define separate factory methods for creating objects and create objects by calling that methods
    ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public WebDriver getDriver(){
        return driver.get();
    }

    public void setDriver(WebDriver driverParam){
        driver.set(driverParam);
    }

    public void closeBrowser(){
        driver.get().close();
        driver.remove();
    }
}
