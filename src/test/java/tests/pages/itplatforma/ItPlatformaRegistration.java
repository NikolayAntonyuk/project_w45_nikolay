package tests.pages.itplatforma;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static tests.logger.CustomLogger.logger;

public class ItPlatformaRegestration {
    SelenideElement buttonSingIn = $(byXpath("//span[@class='text-wrap' and text()='Sign in']"));
    SelenideElement fieldUser = $(byXpath("//input[@id='email']"));
    SelenideElement fieldEmail = $(byXpath("//input[@id='email']"));
    SelenideElement fieldPassword = $(byXpath("//input[@id='password']"));
    SelenideElement buttonLogin = $(byXpath("//button[@id='submit-button']"));

    @Step
    public void pressButtonSingIn() {
        buttonSingIn.click();
        logger.info("ok");

    }
    @Step
    public void fillTheFieldUser(String user) {
        fieldUser.sendKeys(user);
        logger.info(user + " - ok");
    }
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

