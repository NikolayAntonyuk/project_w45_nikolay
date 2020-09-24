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
    SelenideElement fieldEmail = $(byXpath("//input[@id='user_login']"));
    SelenideElement fieldPassword = $(byXpath("//input[@id='user_pass']"));
    SelenideElement buttonLogin = $(byXpath("//button[@class='tml-button']"));
    SelenideElement checkErrorMessege1 = $(byXpath("//li[text()=': Вы не ввели имя пользователя.']"));
    SelenideElement checkErrorMessege2 = $(byXpath("//li[text()=': Вы не ввели пароль.']"));
    SelenideElement checkErrorMessege3 = $(byXpath("//li[text()='Неизвестное имя пользователя. Перепроверьте или попробуйте ваш адрес email.']"));
    SelenideElement checkErrorMessege4 = $(byXpath("//li[@class='tml-error']/a[text()='Забыли пароль?']"));
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

    @Step
    public void checkErrorMessage1() {
        checkErrorMessege1.shouldBe(Condition.visible);
        logger.info("ok");
    }

    @Step
    public void checkErrorMessage2() {
        checkErrorMessege2.shouldBe(Condition.visible);
        logger.info("ok");
    }

    @Step
    public void checkErrorMessage3() {
        checkErrorMessege3.shouldBe(Condition.visible);
        logger.info("ok");
    }

    @Step
    public void checkErrorMessage4() {
        checkErrorMessege4.shouldBe(Condition.visible);
        logger.info("ok");
    }
    @Step
    public void setCheckBoxRememberMe() {
        checkBoxRememberMe.click();
        logger.info("ok");
    }

}

