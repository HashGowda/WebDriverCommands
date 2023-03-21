package PumaFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public WebDriver driver;

    public SearchPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[normalize-space()='Size']")
    WebElement size;

    @FindBy(xpath = "//button[normalize-space()='Gender']")
    WebElement gender;

    @FindBy(xpath = "//button[normalize-space()='Sport']")
    WebElement sport;

    @FindBy(xpath = "//button[normalize-space()='Category']")
    WebElement category;

    @FindBy(xpath = "//button[normalize-space()='Color']")
    WebElement color;

    @FindBy(xpath = "//button[normalize-space()='Price']")
    WebElement price;

    @FindBy(xpath = "//select[@id='product-list-sort-select']")
    WebElement sortBy;

    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement men;

    public void navigateToSearchPage(){
        GenFunctions genFun = new GenFunctions(driver);
        genFun.waitAndClick(size);
        genFun.selectDropdown(size,"8");
        genFun.waitAndClick(gender);
        genFun.selectDropdown(gender,"Male");
        genFun.waitAndClick(sport);
        genFun.selectDropdown(sport,"Cricket");
        genFun.waitAndClick(category);
        genFun.sendKeys(category,"Footwear");
        genFun.waitAndClick(color);
        genFun.selectDropdown(color,"Black");
        genFun.waitAndClick(price);
        genFun.selectDropdown(price,"(1000..3000)");
        genFun.waitAndClick(sortBy);
        genFun.selectDropdown(sortBy,"Newest");
        genFun.isElementPresent(men);
        genFun.scrollDown();
        genFun.scrollUp();
    }


}
