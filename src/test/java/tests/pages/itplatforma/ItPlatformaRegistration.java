package tests.pages.itplatforma;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static tests.logger.CustomLogger.logger;

public class ItPlatformaRegistration {
    SelenideElement buttonSingIn = $(byXpath("//span[@class='text-wrap' and text()='Sign in']"));
    SelenideElement buttonRegistration = $(byXpath("//a[@href='https://it-platforma.website/register/']"));
    SelenideElement fieldUser = $(byXpath("//input[@name='user_login']"));
    SelenideElement fieldEmail = $(byXpath("//input[@name='user_email']"));
    SelenideElement fieldPassword = $(byXpath("//input[@name='user_pass1']"));
    SelenideElement fieldPassword2 = $(byXpath("//input[@name='user_pass2']"));
    SelenideElement buttonRegistration2 = $(byXpath("//button[@class='tml-button']"));

    @Step
    public void pressButtonRegistration() {
        buttonRegistration.click();
        logger.info("ok");
    }
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
    public void fillTheFieldPassword2(String password) {
        fieldPassword2.sendKeys(password);
        logger.info("ok");
    }
    @Step
    public void pressbuttonRegistration2() {
        buttonRegistration2.click();
        logger.info("ok");
    }

}

