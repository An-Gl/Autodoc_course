package lessons.lesson28;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstSelenideTest {

    @BeforeTest
    public void before() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        Configuration.browserSize = "1280x720";
        Configuration.browserPosition = "0x0";
        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 200000;
        Configuration.browserCapabilities = options;
    }

    @Test
    public void firstSelenideTest() {

        open("https://rozetka.com.ua/ua/");
        Cookie cookie = new Cookie("cf_clearance", "mZv_MH97ZSfbNkybcXlinzDSPweiCXllyqUZwASa9f0-1701712264-0-1-a0523e9a.594f871b.f753617a-0.2.1701712264");
        WebDriverRunner.getWebDriver().manage().deleteCookieNamed("cf_clearance");
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);

        $(By.name("search")).setValue("Mac");
        $(By.xpath("//button[contains(@class, 'search-form__submit')]"))
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text("Найти"), Duration.ofSeconds(20))
                .shouldNotHave(Condition.text("Alex"))
                .click();
    }
}
