package pattern.pageobject.selenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.openqa.selenium.Cookie;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.refresh;

public class MainPageLogic extends MainPageLocators {

    public MainPageLogic checkCategoriesQuantity(int categories) {
        sideBarCategories.shouldHave(CollectionCondition.size(categories));
        return this;
    }

    public CategoriesPageLogic clickOnCategory(int categoryNumber) {
        sideBarCategories.get(categoryNumber)
                .shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        return page(CategoriesPageLogic.class);
    }


    public MainPageLogic setCookies(String cookieName, String cookieValue) {
        Cookie cookie = new Cookie(cookieName, cookieValue);
        WebDriverRunner.getWebDriver().manage().deleteCookieNamed(cookieName);
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);

        return this;
    }

}
