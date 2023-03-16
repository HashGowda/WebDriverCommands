package Tests;

import Base.ActionPage;
import Base.BasePage;
import org.testng.annotations.Test;

public class MyInfoTest extends BasePage {
    public ActionPage getActionPage() {
        return new ActionPage();
    }

    @Test
    public void myInfoTest()  {
        getActionPage().myInfoTab();
    }

}
