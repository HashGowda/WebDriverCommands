package Tests;

import Base.ActionPage;
import Base.BasePage;
import Base.LoginPage;
import org.testng.annotations.Test;

public class InValidLoginTest extends BasePage {

    public ActionPage getActionPage() {
        return new ActionPage();
    }

    @Test
    public void InvalidLogin() throws InterruptedException {
        getActionPage().invalidLogin();
    }
}
