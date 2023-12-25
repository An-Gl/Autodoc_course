package lessons.lesson32;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pattern.pageobject.selenide.MainPageLogic;
import pattern.pageobject.selenium.MainPage;

public class TestForMvnSureFire {

    @Test
    @Flaky()
    @Owner("Anna")
    @Lead("Oleg")
    @Description("Short summary")
    @Severity(SeverityLevel.NORMAL)
    @Epic("Checking availability")
    @Feature("Check In")
    @Story("User should choose Flexible Dates")
    @Issue("QC-22")
    @TmsLink("tc-1")
    @Link(name = "requirements of API", url = "https://www.somerequire.com", type = "Trello")
    public void testSurefirePlugin() {
        System.out.println("Message for test");
        //new MainPageLogic().someMethod("Anna");
    }

}
