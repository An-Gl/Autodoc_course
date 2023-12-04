package homeworks.homework27;

import init.WebDriverInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pattern.pageobject.selenium.MainPage;

public class ProductInTheBasket extends WebDriverInit {

    final String EXPECTED_TITTLE = "Ноутбук Lenovo IdeaPad Slim 5 16IAH8 (83BG001ARA) Cloud Grey / 16\" IPS WUXGA / " +
            "Intel Core i5-12450H / RAM 16 ГБ / SSD 512 ГБ / Підсвічування клавіатури / Зарядка через Type-C";

    final String URL = "https://rozetka.com.ua/ua/";

    final String COOKIES_VALUE = "PG1UA_sMjNTJckUQpX32iwg8FhPG3v0_xsK2MsxrYyU-1701633575-0-1-a0523e9a.4a42d5cb.f753617a-0.1.1701633575";

    @Test
    public void addingProductToTheBasket() {
        driver.get(URL);
        String actualProductTitle = new MainPage(driver)
                .clickOnComputerAndNotebookCategory()
                .clickOnComputerSubCategory()
                .changeCFCookie(COOKIES_VALUE)
                .addProductToTheBasketByIndex(0)
                .checkProductsQuantityInBasketPreview()
                .clickOnBasketBtn()
                .getProductTitleInTheBasket();
        Assert.assertEquals(actualProductTitle, EXPECTED_TITTLE);
    }
}
