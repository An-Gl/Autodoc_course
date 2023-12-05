package homeworks.homework26;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pattern.pageobject.selenium.MainPage;

import static java.lang.Thread.sleep;

public class CheckingAvailabilityOfPromoProductsSelectedByFilter extends WebDriverInit {

    final String EXPECTED_PROMO_LABEL = "АКЦІЯ";
    final String cookieValue = "6oG4zCBa65bacfen7Z0NgtqiwhzZYbPeFlK4LypD250-1701723723-0-1-a0523e9a.c993ba73.f753617a-0.2.1701723723";

    @Test
    public void displayOfPromoStickers() throws InterruptedException {
        driver.get("https://rozetka.com.ua/ua/");
        changeCFCookie(cookieValue);
        goToComputersCategory();
        goToLaptopSubcategory();
        selectSupplier();
        setMaxPrice();
        findPromoProduct();
        openProductPageWithPromoSticker();
        checkPromoStickerOnProductPage();
    }

    public void openMainPage() {
        driver.get("https://rozetka.com.ua/ua/");
    }

    public void goToComputersCategory() throws InterruptedException {
        sleep(3000);
        WebElement laptopsAndComputerCategory = webDriverWait.until(ExpectedConditions.elementToBeClickable(By
                .xpath("//ul[contains(@class, 'menu-categories_type_main')]/li[1]")));
        laptopsAndComputerCategory.click();
        sleep(3000);
    }

    public void goToLaptopSubcategory() throws InterruptedException {
        sleep(3000);
        WebElement subCategory = webDriverWait.until(ExpectedConditions.elementToBeClickable(By
                .xpath("(//a[contains(@href, 'c80004/')])[1]")));
        subCategory.click();
        sleep(3000);
    }

      public void openLaptopsPage() {
            driver.get("https://rozetka.com.ua/ua/notebooks/c80004/");
        }
    public void selectSupplier() throws InterruptedException {
        sleep(3000);
        WebElement supplierCheckbox = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-id='Rozetka']")));
            supplierCheckbox.click();
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By
                        .xpath("//a[@class='catalog-selection__link']")));
        sleep(2000);
    }

    public void setMaxPrice() {
        WebElement maxPriceInput = driver.findElement(By.xpath("//input[@formcontrolname='max']"));
        maxPriceInput.clear();
        maxPriceInput.sendKeys("100000");
        maxPriceInput.submit();
    }

    public void findPromoProduct() {
        WebElement productWithPromoLabel = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath("//span[contains(@class, 'type_action')]")));
        String labelOnProduct = productWithPromoLabel.getText().trim();
        Assert.assertEquals(labelOnProduct, EXPECTED_PROMO_LABEL, "Product with promo is absent");
    }

    public void openProductPageWithPromoSticker() {
        WebElement productWithPromoLabelLinkOnProductPage = webDriverWait.until(ExpectedConditions.elementToBeClickable(By
                .xpath("//span[contains(@class, 'type_action')]/../a")));
        String productPageLink = productWithPromoLabelLinkOnProductPage.getAttribute("href");
        driver.get(productPageLink);
    }

    public void changeCFCookie(String value) {
        Cookie cookie = new Cookie("cf_clearance", value);
        driver.manage().deleteCookieNamed("cf_clearance");
        driver.manage().addCookie(cookie);
    }

    public void checkPromoStickerOnProductPage() {
        WebElement productPromoSticker = driver.findElement(By
                .xpath("(//span[contains(@class, 'action promo-label')])[2]"));
        String promoLabelOnProductPage = productPromoSticker.getText().trim();
        Assert.assertEquals(promoLabelOnProductPage, EXPECTED_PROMO_LABEL, "Label is absent");
    }
}
