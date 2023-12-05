package pattern.pageobject.selenium;


import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends MainPageLocators{

    private WebDriver driver;

    public WebDriverWait webDriverWait;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public MainPage changeCFCookie(String value) {
        Cookie cookie = new Cookie("cf_clearance", value);
        driver.manage().deleteCookieNamed("cf_clearance");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
        return this;
    }


    public MainPage typeTextInInputSearch (String test) {
        driver.findElement(inputSearch).sendKeys(test);
        return this;
    }

    public  MainPage clearInputSearch() {
        driver.findElement(inputSearch).clear();
        return this;
    }

    public SearchPage clickBtnSearch() {
        driver.findElement(btnSearch).click();
        return new SearchPage(driver);
    }

    public CategoryPage clickOnComputerAndNotebookCategory() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(computersAndNotebooksSection)).click();
        return new CategoryPage(driver);
    }
}
