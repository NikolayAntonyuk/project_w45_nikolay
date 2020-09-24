package tests.pages.itplatforma;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static tests.common.CommonSteps.getAndAttachScreenshot;
import static tests.logger.CustomLogger.logger;

public class ItPlatformaMainPage {
    SelenideElement buttonSingOut = $(byXpath("//a[@class='screen-reader-shortcut' and "));
    SelenideElement profileName = $(byXpath("//span[@class='display-name']"));

    @Step
    public void checkProfileName() {
        profileName.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }

    @Step
    public void pressButtonSingOut(String buttonText) {
        $(byXpath(buttonSingOut + "text()='" + buttonText + "']")).click();
        logger.info(buttonText + " - ok");
    }

}
