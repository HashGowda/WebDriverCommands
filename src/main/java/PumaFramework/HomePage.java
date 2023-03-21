package PumaFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    GenFunctions genFunctions;

    public HomePage(WebDriver driver){
        this.driver=driver;
        genFunctions = new GenFunctions(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Search PUMA.com']")
    WebElement searchBox;

    public void home(){
        genFunctions.sendKeys(searchBox,"Mens Shoes");
        genFunctions.waitAndClick(searchBox);

    }
}
