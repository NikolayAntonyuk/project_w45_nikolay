package kolya.Task5.pages.MK;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static tests.common.CommonSteps.getAndAttachScreenshot;
import static tests.logger.CustomLogger.logger;

public class MKPasswordPage {
    SelenideElement fieldPassword = $(byXpath("//input[@class='form-control']"));
    SelenideElement buttonUviyty = $(byXpath("//button[@class='btn btn-default']"));

    @Step
    public void fillTheFieldPassword(String password) {
        fieldPassword.sendKeys(password);
        logger.info("ok");
    }
    @Step
    public void pressButtonUviyty() {
        buttonUviyty.click();
        logger.info("ok");
       }

}
