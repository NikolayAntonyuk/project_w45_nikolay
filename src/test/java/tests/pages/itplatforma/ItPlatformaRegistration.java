package tests.pages.itplatforma;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static tests.common.CommonSteps.getAndAttachScreenshot;
import static tests.logger.CustomLogger.logger;

public class ItPlatformaRegistration {
    SelenideElement buttonSingIn = $(byXpath("//span[@class='text-wrap' and text()='Sign in']"));
    SelenideElement buttonRegistration = $(byXpath("//a[@href='https://it-platforma.website/register/']"));
    SelenideElement fieldUser = $(byXpath("//input[@name='user_login']"));
    SelenideElement fieldEmail = $(byXpath("//input[@name='user_email']"));
    SelenideElement fieldPassword = $(byXpath("//input[@name='user_pass1']"));
    SelenideElement fieldPassword2 = $(byXpath("//input[@name='user_pass2']"));
    SelenideElement buttonRegistration2 = $(byXpath("//button[@class='tml-button']"));
    SelenideElement checkErrorMessege1 = $(byXpath("//li[text()=': Пожалуйста, введите имя пользователя.']"));
    SelenideElement checkErrorMessege2 = $(byXpath("//li[text()=': Пожалуйста, введите ваш адрес email.']"));
    SelenideElement checkErrorMessege3 = $(byXpath("//li[text()=': Please enter a password.']"));
    SelenideElement checkErrorMessege4 = $(byXpath("//li[text()=': Это имя пользователя уже зарегистрировано. Пожалуйста, выберите другое.']"));
    SelenideElement checkErrorMessege5 = $(byXpath("//li[text()=': Этот email уже зарегистрирован. Пожалуйста, введите другой.']"));
    SelenideElement checkErrorMessege6 = $(byXpath("//li[text()=': Please enter a password.']"));
    SelenideElement checkErrorMessege7 = $(byXpath("//li[text()=': Некорректный адрес email.']"));

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
/*    @Step
    public void checkErrorMessage(String text) {
        //checkUrl("register");
        $(byXpath(checkErrorMessege + text + "')]")).shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("value: " + text + " - ok");
    }*/
    @Step
    public void checkErrorMessage1() {
        checkErrorMessege1.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }
    @Step
    public void checkErrorMessage2() {
        checkErrorMessege2.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }
    @Step
    public void checkErrorMessage3() {
        checkErrorMessege3.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }
    @Step
    public void checkErrorMessage4() {
        checkErrorMessege4.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }
    @Step
    public void checkErrorMessage5() {
        checkErrorMessege5.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }
    @Step
    public void checkErrorMessage6() {
        checkErrorMessege6.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }
    @Step
    public void checkErrorMessage7() {
        checkErrorMessege7.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("ok");
    }

}

