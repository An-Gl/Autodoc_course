package lessons.lesson26;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestSelectAutodoc extends WebDriverInit {

    @Test
    public void testSelect() throws InterruptedException {
        driver.get("https://www.autodoc.de/");
        WebElement cookiesNotification = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(
                By.linkText("Alle Cookies erlauben")));
        if (cookiesNotification.isDisplayed()) {
            cookiesNotification.click();
        }
        getMarkByValue(driver, "25");
    }

    public void getMarkByValue(WebDriver driverForTest, String markValue) throws InterruptedException {
        driver.manage().deleteAllCookies();
        WebElement makerList = driver.findElement(By.id("form_maker_id"));

        String markOptionValue =
                String.format("//select[@id='form_maker_id']/optgroup[2]/option[@value='%s']", markValue);
        makerList.click();
        driverForTest.findElement(By.xpath(markOptionValue)).click();
        sleep(5000);
    }
}
