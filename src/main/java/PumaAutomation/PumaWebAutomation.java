package PumaAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collections;
import java.util.List;

public class PumaWebAutomation {

    public static void main(String[] args) throws InterruptedException {
        PumaWebAutomation pu = new PumaWebAutomation();
        pu.launch();
        pu.clickOnButton();
        pu.clickOnDropdown();
        pu.tearDown();
    }

    public WebDriver driver;
    public WebDriverWait wait;

    void launch() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://in.puma.com/in/en");
        System.out.println("App launched successfully");
        Thread.sleep(2000);
    }

//    public void explicitWait(String element){
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        if (element.equals(By.id("id"))){
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(element)));
//        } else {
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
//        }
//    }

    void scrollDown() throws InterruptedException {
        WebElement men = driver.findElement(By.xpath("(//*[text()='MEN'])[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        //js.executeScript("arguments[0].scrollIntoView();", men);
        System.out.println("Scrolled down successfully");
        Thread.sleep(2000);
    }

    void clickOnButton() throws InterruptedException {
//        String xpath = "(//*[text()='MEN'])[1]";
//        explicitWait(xpath);
        scrollDown();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[text()='MEN'])[1]")).click();
        System.out.println("Clicked on button successfully");
        Thread.sleep(2000);
    }

    void clickOnDropdown() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='Category']")).click();
        System.out.println("Clicked on category successfully");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='Apparel']")).click();
        System.out.println("Clicked on apparel check box successfully");
        Thread.sleep(2000);
        //clickOnCloseBtn();
        clearBtn();
        Thread.sleep(2000);
    }

    void clickOnCloseBtn() throws InterruptedException {
        driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
        System.out.println("Clicked on close button successfully");
        Thread.sleep(2000);
    }

    void clearBtn() throws InterruptedException {
        driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
        System.out.println("Clicked on clear button successfully");
        Thread.sleep(2000);
        sortDropdown();
    }

    void sortDropdown() throws InterruptedException {
        driver.findElement(By.xpath("//*[@*='sortBy']")).click();
        System.out.println("Clicked on sortBy dropdown successfully");
        Thread.sleep(2000);
        dropdownList();
        selectSortByOption();
    }

    void selectSortByOption() throws InterruptedException {
        WebElement sortOptions = driver.findElement(By.xpath("//*[@*='sortBy']"));
        Select select = new Select(sortOptions);
        select.selectByVisibleText("Top Sellers");
        System.out.println("\nSelected by visible text");
        Thread.sleep(2000);
        select.selectByValue("new-arrivals");
        System.out.println("Selected by value");
        Thread.sleep(2000);
        select.selectByIndex(4);
        System.out.println("selected by index");
    }

    void dropdownList() throws InterruptedException {
        List<WebElement> list = Collections.singletonList(driver.findElement(By.xpath("//*[@*='sortBy']")));
        for (int i=0; i<list.size();i++){
            String sortList = list.get(i).getText();
            System.out.println("\nList : \n"+sortList);
            Thread.sleep(2000);
        }
    }

    void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("\nClosed successfully");
        driver.quit();
    }
}
