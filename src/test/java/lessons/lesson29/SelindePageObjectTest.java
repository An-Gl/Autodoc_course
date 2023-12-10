package lessons.lesson29;

import init.InitialSelenide;
import org.testng.annotations.Test;
import pattern.pageobject.selenide.MainPageLogic;

import static com.codeborne.selenide.Selenide.open;

public class SelindePageObjectTest extends InitialSelenide {

    @Test
    public void testSelenidePO() {
        open("https://rozetka.com.ua/");
        new MainPageLogic().checkCategoriesQuantity(16).clickOnCategory(0)
                .clickOnSubCategoryLaptops()
                .checkQuantityOfGoodsTittles(60);
    }
}