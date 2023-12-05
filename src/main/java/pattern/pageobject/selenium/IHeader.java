package pattern.pageobject.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static java.lang.Thread.sleep;

public interface IHeader {

    By productCounterInBasketPreview = By.xpath("//span[contains(@class, 'badge badge')]");

    By basketBtnInPreview = By.xpath("(//button[contains(@class,'header__button')])[3]");

    By productTitleInTheBasket = By.xpath("//a[@class='cart-product__title']");

    default void checkProductsQuantityInBasketPreviewI(WebDriver driver) {
        String actualProductQuantity = driver.findElement(By.xpath("//span[contains(@class, 'badge badge')]"))
                .getAttribute("innerText");
        Assert.assertEquals(actualProductQuantity, "1");
    }

    default void clickOnBasketBtnI(WebDriver driver) throws InterruptedException {
        sleep(5000);
        driver.findElement(basketBtnInPreview).click();
        sleep(5000);
    }

    default String getProductTitleInTheBasketI(WebDriver driver) throws InterruptedException {
        sleep(5000);
        return driver.findElement(productTitleInTheBasket).getAttribute("innerText");
    }
}
