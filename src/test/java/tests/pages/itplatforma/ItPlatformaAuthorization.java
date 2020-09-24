package tests.pages.itplatforma;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static tests.logger.CustomLogger.logger;

public class ItPlatformaAuthorization {
    SelenideElement buttonSingIn = $(byXpath("//span[@class='text-wrap' and text()='Sign in']"));
    SelenideElement fieldUser = $(byXpath("//input[@id='user_login']"));
    SelenideElement fieldEmail = $(byXpath("//input[@id='user_login']"));
    SelenideElement fieldPassword = $(byXpath("//input[@id='user_pass']"));
    SelenideElement buttonLogin = $(byXpath("//button[@class='tml-button']"));




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

