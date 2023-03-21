package PumaFramework;

import org.testng.annotations.Test;

public class TestClass extends BaseClass{

    @Test
    public void homePage(){
        HomePage hp = new HomePage(driver);
        hp.home();
        SearchPage sp = new SearchPage(driver);
        sp.navigateToSearchPage();
    }

}
