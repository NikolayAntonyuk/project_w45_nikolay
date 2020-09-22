package tests.pages.google;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static tests.logger.CustomLogger.logger;

public class GoogleMainPage {
    String buttonXPath = "//div[@class='FPdoLc tfB0Bf']//input";
    SelenideElement fieldSearch = $(byXpath("//input[@name='q']"));

    @Step
    public void fillTheFieldSearch(String text) {
        fieldSearch.sendKeys(text);
        logger.info("value: " + text + " - ok");
    }

    @Step
    public void pressButton(String buttonText) {
        $(byXpath(buttonXPath + "[@value='" + buttonText + "']")).click();
        logger.info(buttonText + " - ok");
    }

}
