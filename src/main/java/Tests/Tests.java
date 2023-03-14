package Tests;

import org.testng.annotations.Test;
import PageObjects.LoginPageObjects;
import TestBase.TestBase;

public class Tests extends TestBase {
    LoginPageObjects loginPage = new LoginPageObjects();

    @Test
    public void TestCase1() {
        loginPage.login("Admin", "admin123");
    }

    @Test
    public void TestCase2() {
        loginPage.login("Admin", "admin12");
    }

    @Test
    public void TestCase3() {
        System.out.println("Third test case");
    }
}
