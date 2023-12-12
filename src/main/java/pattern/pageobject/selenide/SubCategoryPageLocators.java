package pattern.pageobject.selenide;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class SubCategoryPageLocators {

    SelenideElement productsBuyBtn = $(byXpath("//button[contains(@class, 'buy-button')]"));

}
