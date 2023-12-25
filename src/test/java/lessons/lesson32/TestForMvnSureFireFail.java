package lessons.lesson32;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForMvnSureFireFail {

    @Test
    @Flaky()
    @Owner("Anna")
    @Lead("Oleg")
    @Description("Test check something")
    @Severity(SeverityLevel.NORMAL)
    @Epic("Checking unavailability")
    @Feature("Check Out")
    @Story("User should choose Flexible Times")
    @Issue("WW-1")
    @TmsLink("tc-1")
    @Link(name = "requirements", url = "https://www.somerequire.com", type = "Trello")
    public void testSurefirePlugin() {
        Assert.fail("Test failed");
    }
}
