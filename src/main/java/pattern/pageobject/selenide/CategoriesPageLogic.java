package pattern.pageobject.selenide;

import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;

public class CategoriesPageLogic extends CategoriesPageLocators {

    public SearchPageLogic clickOnSubCategoryLaptops() {
        laptopSubCategory
                .shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        return page(SearchPageLogic.class);
    }

    public SubCategoryPageLogic goToSubCategoryPage() {
        laptopSubCategory.shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        return page(SubCategoryPageLogic.class);
    }

}
