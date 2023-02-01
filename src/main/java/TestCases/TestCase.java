package TestCases;

import Pages.BaseClass;
import Pages.CheckBox;
import Pages.MainPage;
import org.testng.annotations.Test;

public class TestCase extends BaseClass {

//    @Test
//    public void login(){
//        MainPage main = new MainPage(driver);
//        main.mainPage();
//    }
//
//    @Test
//    public void invalidLogin(){
//        MainPage main = new MainPage(driver);
//        main.mainPage();
//    }

    @Test
    public void checkbox(){
        CheckBox check = new CheckBox(driver);
        check.checkBox();
    }

}
