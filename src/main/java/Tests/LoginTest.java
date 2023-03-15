package Tests;

import Base.ActionPage;
import Base.BasePage;
import org.testng.annotations.Test;

public class LoginTest extends BasePage {
    public ActionPage getActionPage() {
        return new ActionPage();
    }

    @Test
    public void LoginTest() throws InterruptedException {
        getActionPage().validLogin();
    }

    @Test
    public void MyInfoTest() throws InterruptedException {
        getActionPage().myInfoTab();
    }
}
