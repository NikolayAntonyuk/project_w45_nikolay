package kolya.Task5.pages.stackoverflow;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static tests.logger.CustomLogger.logger;

public class StackOverFlowLoginPage {
    SelenideElement fieldEmail = $(byXpath("//input[@id='email']"));
    SelenideElement fieldPassword = $(byXpath("//input[@id='password']"));
    SelenideElement buttonLogin = $(byXpath("//button[@id='submit-button']"));

    @Step
    public void fillTheFieldEmail(String email) {
        fieldEmail.sendKeys(email);
        logger.info(email + " - ok");
    }

    @Step
    public void fillTheFieldPassword(String password) {
        fieldPassword.sendKeys(password);
        logger.info("ok");
    }

    @Step
    public void pressButtonLogin() {
        buttonLogin.click();
        logger.info("ok");
    }

}
