package pattern.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.lang.model.element.Name;

public class MainPage {
    @FindBy(className = "search")
    private WebElement inputSearch;
    @FindBy(xpath = "//button[contains(@class, 'search-form__submit')]")
    private WebElement btnSearch;
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage typeTextInInputSearch (String test) {
        inputSearch.sendKeys(test);
        return this;
    }

    public  MainPage clearInputSearch() {
        inputSearch.clear();
        return this;
    }

    public SearchPage clickBtnSearch() {
        btnSearch.click();
        return new SearchPage(driver);
    }
}
