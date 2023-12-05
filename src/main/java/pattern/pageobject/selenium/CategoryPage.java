package pattern.pageobject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CategoryPage {
    By notebooksSubCategory = By.xpath("(//a[contains(@href, 'c80004/')])[1]");

    private WebDriver driver;

    public WebDriverWait webDriverWait;

    public CategoryPage(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public SubCategoryPage clickOnComputerSubCategory () {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(notebooksSubCategory)).click();
        return new SubCategoryPage(driver);
    }

}
