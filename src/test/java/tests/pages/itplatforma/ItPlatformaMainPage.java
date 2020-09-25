package tests.pages.itplatforma;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static tests.common.CommonSteps.getAndAttachScreenshot;
import static tests.logger.CustomLogger.logger;

public class ItPlatformaMainPage {
    //SelenideElement profileOut = $(byXpath("//ul[@class='tml-dashboard-links']/child::li/a[text()='Выйти']"));
    SelenideElement profileOut = $(byXpath(" //div[@class='ab-sub-wrapper']/ul/li/a[text()='Выйти']"));
    SelenideElement muvetoElement = $(byXpath("//li[@id='wp-admin-bar-my-account']"));
    String buttonSingOut = "//a[@class='ab-item'";
    SelenideElement profileName = $(byXpath("//img[@class='avatar avatar-26 photo']"));
    String buttonXPath = "//span[@class='text-wrap' ";
    SelenideElement checkLoginPage = $(byXpath("//h1[@class='page-header-title clr']"));

    @Step
    public void muvetoElement() {
        muvetoElement.click();
        logger.info("ok");
    }

    @Step
    public void clickSingOut(String buttonText) {
        $(byXpath(buttonSingOut + "and text()='" + buttonText + "']")).click();
        getAndAttachScreenshot();
        logger.info(buttonText + " - ok");
    }

    @Step
    public void pressButtonHeader(String buttonText) {
        $(byXpath(buttonXPath + "and contains(text(),'" + buttonText + "')]")).click();
        logger.info(buttonText + " - ok");
    }

    @Step
    public void checkROOT() {
        profileName.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }

    @Step
    public void checkProfileName() {
        profileName.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }

    @Step
    public void pressButtonSingOut() {
        profileOut.click();
        logger.info("ok");
    }

}
