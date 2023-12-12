package pattern.pageobject.selenide;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public interface IHeader {

    SelenideElement productCounterInBasketPreview = $(byXpath("//span[contains(@class, 'badge badge')]"));
    SelenideElement basketBtnInPreview = $(byXpath("(//button[contains(@class,'header__button')])[3]"));
    SelenideElement productTitleInTheBasket = $(byXpath("//a[@class='cart-product__title']"));



    default void checkProductsQuantityInBasketPreviewI(int expectedProductQuantity) {
        productCounterInBasketPreview
                .getAttribute("innerText")
                .equals(expectedProductQuantity);

    }

    default void clickOnBasketBtnI() {
        basketBtnInPreview.click();
    }

    default void getProductTitleInTheBasketI() {
        productTitleInTheBasket.getAttribute("innerText");
    }
}
