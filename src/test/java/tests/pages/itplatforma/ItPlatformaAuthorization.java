package tests.pages.itplatforma;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static tests.logger.CustomLogger.logger;

public class ItPlatformaAuthorization {
    SelenideElement buttonSingIn = $(byXpath("//span[@class='text-wrap' and text()='Sign in']"));
    SelenideElement fieldUser = $(byXpath("//input[@id='user_login']"));
    SelenideElement fieldPassword = $(byXpath("//input[@id='user_pass']"));
    SelenideElement buttonLogin = $(byXpath("//button[@class='tml-button']"));
    String  checkErrorMessege = "//li";
    String checkErrorMessege1 = "//li[@class='tml-error']/a";
    SelenideElement checkBoxRememberMe = $(byXpath("//input[@id='rememberme']"));


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
    public void fillTheFieldPassword(String password) {
        fieldPassword.sendKeys(password);
        logger.info("ok");
    }

    @Step
    public void pressButtonLogin() {
        buttonLogin.click();
        logger.info("ok");
    }

    @Step
    public void checkErrorMessage(String errorText) {
        $(byXpath(checkErrorMessege + "[text()='" + errorText + "']")).shouldBe(Condition.visible);
        logger.info(errorText + "ok");
    }

    @Step
    public void checkErrorMessage1(String errorText) {
        $(byXpath(checkErrorMessege1 + "[text()='" + errorText + "']")).shouldBe(Condition.visible);
        logger.info(errorText + "ok");
    }

    @Step
    public void setCheckBoxRememberMe() {
        checkBoxRememberMe.click();
        logger.info("ok");
    }

}

