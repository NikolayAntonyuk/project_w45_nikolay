package kolya.Task5.pages.stackoverflow;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static tests.common.CommonSteps.getAndAttachScreenshot;
import static tests.logger.CustomLogger.logger;

public class StackOverFlowMainPage {
    SelenideElement buttonSignIn = $(byXpath("//a[text()='Войти']"));
    SelenideElement profileIcon = $(byXpath("//div[@title='Autotest']"));

    @Step
    public void pressButtonSignIn() {
        buttonSignIn.click();
        logger.info("ok");
    }

    @Step
    public void checkProfileIcon() {
        profileIcon.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }

}
