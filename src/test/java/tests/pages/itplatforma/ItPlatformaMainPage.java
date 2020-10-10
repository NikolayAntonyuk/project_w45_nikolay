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

    SelenideElement profileName = $(byXpath("//img[@class='avatar avatar-26 photo']"));
    String buttonXPath = "//span[@class='text-wrap' ";
    String checkLoginPage = "//h1[@class='page-header-title clr' and ";
    SelenideElement FiveElement = $(byXpath("//div[@class='mWidth topMenu']"));
    String pressNewesPage = "//a[@ ";
    SelenideElement Blog = $(byXpath("//h2[@class='single-post-title entry-title']"));
    SelenideElement sellectElementsProfile = $(byXpath("//li[@id='wp-admin-bar-my-account']"));
    String buttonSingOut = "//a[@class='ab-item'";
    SelenideElement pressPageNumbers2 = $(byXpath("//a[@class='page-numbers']"));
    SelenideElement fieldSearch = $(byXpath("//input[@id='ocean-search-form-1']"));
    SelenideElement resultSearch = $(byXpath("//span[@class='breadcrumb-search']"));

    @Step
    public void sellectElements() {
        sellectElementsProfile.hover();
        logger.info("ok");

    }

    @Step
    public void pressButtonSingOut(String buttonText) {
        $(byXpath(buttonSingOut + "and text()='" + buttonText + "']")).click();
        getAndAttachScreenshot();
        logger.info(buttonText + " - ok");
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
        logger.info(PageText + " - ok");
    }

    @Step
    public void checkPricingPage() {
        checkUrl("klubnye-karty");
        FiveElement.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }

    @Step
    public void checkChooseYourPackPage() {
        checkUrl("shedule");
        FiveElement.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }

    @Step
    public void checkAchieveYourGoalPage() {
        checkUrl("special_offer");
        FiveElement.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }

    @Step
    public void checkYourObjectivePage() {
        checkUrl("5element.ua");
        FiveElement.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }

    @Step
    public void pressNewesPage(String PageText) {
        $(byXpath(pressNewesPage + "title='" + PageText + "']")).click();
        getAndAttachScreenshot();
        logger.info(PageText + " - ok");
    }

    @Step
    public void checkOpendNewesPage1() {
        checkUrl("neque-adipiscing-an-cursus");
        Blog.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }

    @Step
    public void checkOpendNewesPage2() {
        checkUrl("litora-torqent-per-conubia");
        Blog.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }

    @Step
    public void checkOpendNewesPage3() {
        checkUrl("praesent-libro-se-cursus-ante");
        Blog.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }
    @Step
    public void checkOpendNewesPage4() {
        checkUrl("metus-vitae-pharetra-auctor");
        Blog.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }
    @Step
    public void checkOpendNewesPage5() {
        checkUrl("interdum-magna-augue-eget");
        Blog.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }
    public void checkOpendNewesPage6() {
        checkUrl("torquent-per-conubia-nostra");
        Blog.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }
    @Step
    public void pressPageNumbers2() {
        pressPageNumbers2.click();
        logger.info("ok");
    }
    @Step
    public void checkPageNumbers2(String PageText) {
        $(byXpath(pressNewesPage + "title='" + PageText + "']")).shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info(PageText + " - ok");
    }
    @Step
    public void fieldSearch(String searchText) {
        fieldSearch.sendKeys(searchText);
        fieldSearch.pressEnter();
        logger.info(searchText + " - ok");
    }
    @Step
    public void resultSearch() {
        resultSearch.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }






}
