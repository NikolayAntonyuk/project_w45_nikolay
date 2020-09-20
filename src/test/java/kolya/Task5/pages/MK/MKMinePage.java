package kolya.Task5.pages.MK;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static tests.common.CommonSteps.getAndAttachScreenshot;
import static tests.logger.CustomLogger.logger;

public class MKMinePage {
    SelenideElement LogoMK = $(byXpath("//div[@class='header-main__logo-text']"));
   // SelenideElement buttonUviyty = $(byXpath("//button[@class='btn btn-default']"));


    @Step
    public void checkProfileIcon() {
        LogoMK.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }

}
