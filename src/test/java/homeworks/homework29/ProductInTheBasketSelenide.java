package homeworks.homework29;

import init.InitialSelenide;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import pattern.pageobject.selenide.MainPageLogic;

import static com.codeborne.selenide.Selenide.open;

public class ProductInTheBasketSelenide extends InitialSelenide {

    final String EXPECTED_TITTLE = "Ноутбук Lenovo IdeaPad Slim 3 15AMN8 (82XQ009HRA) Arctic Grey / " +
            "15.6\" IPS Full HD / AMD Ryzen 5 7520U / RAM 16 ГБ / SSD 512 ГБ";
    final String COOKIE_NAME = "cf_clearance";
    final String COOKIE_VALUE = "5SNvzKhclUpzH8u1HCf6m1vjvhVmwWNwRdbeEGWshDc-1702411569-0-1-f060de44.55cf7d54.a76181a4-0.2.1702411569";

    @Test
    public void addingProductToTheBasket() {
        open("https://rozetka.com.ua/");
        new MainPageLogic()
                .setCookies(COOKIE_NAME, COOKIE_VALUE)
                .clickOnCategory(0)
                .goToSubCategoryPage()
                .addProductToTheBasket()
                .checkProductsQuantityInBasketPreview(1)
                .clickOnBasketBtn()
                .getProductTitleInTheBasket().equals(EXPECTED_TITTLE);

    }
}
