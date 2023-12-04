package pattern.pageobject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SubCategoryPage implements IHeader{
    By productBuyBtn = By.xpath("//button[contains(@class, 'buy-button')]");

    private WebDriver driver;
    public WebDriverWait webDriverWait;

    public SubCategoryPage(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }

    public SubCategoryPage changeCFCookie(String value) {
        Cookie cookie = new Cookie("cf_clearance", value);
        driver.manage().deleteCookieNamed("cf_clearance");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
        return this;
    }

    public SubCategoryPage addProductToTheBasketByIndex(int productIndex) {
        List<WebElement> products = driver.findElements(productBuyBtn);
        products.get(productIndex).click();
        return this;
    }

    public SubCategoryPage checkProductsQuantityInBasketPreview() {
        checkProductsQuantityInBasketPreviewI(driver);
        return this;
    }

    public SubCategoryPage clickOnBasketBtn() {
        clickOnBasketBtnI(driver);
        return this;
    }

    public String getProductTitleInTheBasket() {
        return getProductTitleInTheBasketI(driver);
    }

}
