package PumaTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PumaLogin {

    @FindBy(xpath = "//input[@placeholder='Search PUMA.com']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[normalize-space()='Size']")
    public WebElement size;

    @FindBy(xpath = "//button[normalize-space()='Gender']")
    public WebElement gender;

    @FindBy(xpath = "//button[normalize-space()='Sport']")
    public WebElement sport;

    @FindBy(xpath = "//button[normalize-space()='Category']")
    public WebElement category;

    @FindBy(xpath = "//button[normalize-space()='Color']")
    public WebElement color;

    @FindBy(xpath = "//button[normalize-space()='Price']")
    public WebElement price;

    @FindBy(xpath = "//select[@id='product-list-sort-select']")
    public WebElement sortBy;

    @FindBy(xpath = "//span[normalize-space()='Men']")
    public WebElement men;

}
