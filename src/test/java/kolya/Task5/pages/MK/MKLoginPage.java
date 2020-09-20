package kolya.Task5.pages.MK;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static tests.logger.CustomLogger.logger;

public class MKLoginPage {
    SelenideElement fieldLogin = $(byXpath("//input[@class='form-control OVDENX-i-a']"));
    SelenideElement buttonDali = $(byXpath("//button[@class='btn btn-default']"));



    @Step
    public void fillTheFieldLogin(String msisdn) {
        fieldLogin.sendKeys(msisdn);
        logger.info(msisdn + " - ok");
    }
    @Step
    public void pressButtonDali() {
        buttonDali.click();
        logger.info("ok");

    }
}
