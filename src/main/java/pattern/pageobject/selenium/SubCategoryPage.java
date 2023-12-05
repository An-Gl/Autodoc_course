package pattern.pageobject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class SubCategoryPage implements IHeader{
    By productBuyBtn = By.xpath("(//button[contains(@class, 'buy-button')])[1]");

    private WebDriver driver;
    public WebDriverWait webDriverWait;

    public SubCategoryPage(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }

    public SubCategoryPage addProductToTheBasket() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(productBuyBtn)).click();
        return this;
    }

    public SubCategoryPage checkProductsQuantityInBasketPreview() {
        checkProductsQuantityInBasketPreviewI(driver);
        return this;
    }

    public SubCategoryPage clickOnBasketBtn() throws InterruptedException {
        clickOnBasketBtnI(driver);
        return this;
    }

    public String getProductTitleInTheBasket() throws InterruptedException {
        return getProductTitleInTheBasketI(driver);
    }

}
