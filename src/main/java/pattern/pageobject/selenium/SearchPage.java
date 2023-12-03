package pattern.pageobject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage {
    private WebDriver driver;

    By productTitle = By.xpath("//span[@class='goods-tile__title']");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage clickOnProductTitleByIndex(int titleIndex) {
        List<WebElement> titles = driver.findElements(productTitle);
        titles.get(titleIndex).click();
        return new ProductPage(driver);
    }
}
