package Tests;

import PumaTest.PumaAction;
import PumaTest.PumaBase;
import org.testng.annotations.Test;

public class PumaSearchPage extends PumaBase {
    public PumaAction getPumaAction(){
        return new PumaAction();
    }

    @Test
    public void pumaTest(){
        getPumaAction().pumaSearchPage();
    }
}
