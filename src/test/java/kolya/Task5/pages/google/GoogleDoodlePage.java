package kolya.Task5.pages.google;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static tests.common.CommonSteps.checkUrl;
import static tests.logger.CustomLogger.logger;

public class GoogleDoodlePage {
    SelenideElement buttonArchiveDoodles = $(byXpath("//a[@id='archive-link-link']"));

    @Step
    public void checkDoodlesPage() {
        checkUrl("doodles");
        buttonArchiveDoodles.shouldBe(Condition.visible);
        logger.info("ok");
    }

    @Step
    public void pressButtonArchiveDoodles() {
        buttonArchiveDoodles.click();
        logger.info("ok");
    }

}
