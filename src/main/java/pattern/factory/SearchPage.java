package pattern.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {
    private WebDriver driver;

    @FindBy(xpath = "//span[@class='goods-tile__title']")
    private WebElement productTitle;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ProductPage clickOnProductTitleByIndex(int titleIndex) {
        List<WebElement> titles = (List<WebElement>) productTitle;
        titles.get(titleIndex).click();
        return new ProductPage(driver);
    }
}
