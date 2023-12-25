package pattern.pageobject.selenide;


import com.codeborne.selenide.Condition;
import java.time.Duration;

public class SubCategoryPageLogic extends SubCategoryPageLocators implements IHeader {

    public SubCategoryPageLogic addProductToTheBasket() {
        productsBuyBtn
                .shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        return this;
    }

    public SubCategoryPageLogic checkProductsQuantityInBasketPreview(int expectedProductQuantity) {
        checkProductsQuantityInBasketPreviewI(expectedProductQuantity);
        return this;
    }

    public SubCategoryPageLogic clickOnBasketBtn() {
        clickOnBasketBtnI();
        return this;
    }

    public SubCategoryPageLogic getProductTitleInTheBasket() {
        getProductTitleInTheBasketI();
        return this;
    }
}
