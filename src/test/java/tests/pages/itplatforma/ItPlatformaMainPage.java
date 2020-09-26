package tests.pages.itplatforma;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static tests.common.CommonSteps.checkUrl;
import static tests.common.CommonSteps.getAndAttachScreenshot;
import static tests.logger.CustomLogger.logger;

public class ItPlatformaMainPage {
    SelenideElement profileOut = $(byXpath("//ul[@class='tml-dashboard-links']/child::li/a[text()='Выйти']"));
    SelenideElement profileName = $(byXpath("//img[@class='avatar avatar-26 photo']"));
    String buttonXPath = "//span[@class='text-wrap' ";
    String checkLoginPage = "//h1[@class='page-header-title clr' and ";
    SelenideElement PricingPage = $(byXpath("//div[@id='breadCrumbs']"));
    SelenideElement ChooseYourPac = $(byXpath("//div[@id='breadCrumbs']"));
    //SelenideElement profileOut = $(byXpath(" //div[@class='ab-sub-wrapper']/ul/li/a[text()='Выйти']"));
    String buttonSingOut = "//a[@class='ab-item'";


    @Step
    public void pressButtonSingOut() {
        profileOut.click();
        logger.info("ok");
    }
    @Step
    public void checkProfileName() {
        profileName.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }
    @Step
    public void pressButtonHeader(String buttonText) {
        $(byXpath(buttonXPath + "and contains(text(),'" + buttonText + "')]")).click();
        logger.info(buttonText + " - ok");
    }
    @Step
    public void checkLoginPage(String PageText) {
        $(byXpath(checkLoginPage + "text()='" + PageText + "']")).shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info(PageText + "ok");
    }
    @Step
    public void checkPricingPage() {
        checkUrl("klubnye-karty");
        PricingPage.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }
    @Step
    public void checkChooseYourPackPage() {
        checkUrl("shedule");
        ChooseYourPac.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }

    @Step
    public void clickSingOut(String buttonText) {
        $(byXpath(buttonSingOut + "and text()='" + buttonText + "']")).click();
        getAndAttachScreenshot();
        logger.info(buttonText + " - ok");
    }



    @Step
    public void checkROOT() {
        profileName.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }





}
