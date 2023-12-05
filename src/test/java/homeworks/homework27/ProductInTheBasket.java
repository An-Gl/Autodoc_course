package homeworks.homework27;

import init.WebDriverInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pattern.pageobject.selenium.MainPage;

public class ProductInTheBasket extends WebDriverInit {

    final String EXPECTED_TITTLE = "Ноутбук Lenovo IdeaPad Slim 5 16IAH8 (83BG001ARA) Cloud Grey / 16\" IPS WUXGA / " +
            "Intel Core i5-12450H / RAM 16 ГБ / SSD 512 ГБ / Підсвічування клавіатури / Зарядка через Type-C";

    final String URL = "https://rozetka.com.ua/ua/";

    final String COOKIES_VALUE = "LrDNkODK_.EOQleIElDIYkIN9_i8HigNCwQjDdtD_MU-1701715602-0-1-a0523e9a.1b18b253.f753617a-0.2.1701715602";

    @Test
    public void addingProductToTheBasket() throws InterruptedException {
        driver.get(URL);
        String actualProductTitle = new MainPage(driver)
                .changeCFCookie(COOKIES_VALUE)
                .clickOnComputerAndNotebookCategory()
                .clickOnComputerSubCategory()
                .addProductToTheBasket()
                .checkProductsQuantityInBasketPreview()
                .clickOnBasketBtn()
                .getProductTitleInTheBasket();
        Assert.assertEquals(actualProductTitle, EXPECTED_TITTLE);
    }
}
