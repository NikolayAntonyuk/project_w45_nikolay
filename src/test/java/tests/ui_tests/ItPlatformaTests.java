package tests.ui_tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.data.ItPlatformaUser;
import tests.data.Projects;
import tests.runners.Debug;
import tests.utils.ExcelUtils;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static tests.utils.SimpleExcelWriterExample.writeToExcelFile;

public class ItPlatformaTests extends Debug {


    @Test()
    public void checkRegistration() {
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaRegistration.pressButtonSingIn();
        ItPlatformaRegistration.pressButtonRegistration();
        ItPlatformaRegistration.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaRegistration.fillTheFieldEmail(ItPlatformaUser.EMAIL.getValue());
        ItPlatformaRegistration.fillTheFieldPassword(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaRegistration.fillTheFieldPassword2(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaRegistration.pressbuttonRegistration2();
        ItPlatformaMainPage.checkProfileName();
        ItPlatformaMainPage.sellectElements();
        ItPlatformaMainPage.pressButtonSingOut("Выйти");
    }

    @Test()
    public void checkValidReg() {
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaRegistration.pressButtonSingIn();
        ItPlatformaRegistration.pressButtonRegistration();
        ItPlatformaRegistration.pressbuttonRegistration2();
        ItPlatformaRegistration.checkErrorMessage(": Пожалуйста, введите имя пользователя.");
        ItPlatformaRegistration.checkErrorMessage(": Пожалуйста, введите ваш адрес email.");
        ItPlatformaRegistration.checkErrorMessage(": Please enter a password.");
        ItPlatformaRegistration.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaRegistration.pressbuttonRegistration2();
        ItPlatformaRegistration.checkErrorMessage(": Пожалуйста, введите ваш адрес email.");
        ItPlatformaRegistration.checkErrorMessage(": Please enter a password.");
        ItPlatformaRegistration.checkErrorMessage(": Это имя пользователя уже зарегистрировано. Пожалуйста, выберите другое.");
        ItPlatformaRegistration.fillTheFieldUser(ItPlatformaUser.USER2.getValue());
        ItPlatformaRegistration.pressbuttonRegistration2();
        ItPlatformaRegistration.checkErrorMessage(": Пожалуйста, введите ваш адрес email.");
        ItPlatformaRegistration.checkErrorMessage(": Please enter a password.");
        ItPlatformaRegistration.fillTheFieldEmail(ItPlatformaUser.EMAIL.getValue());
        ItPlatformaRegistration.pressbuttonRegistration2();
        ItPlatformaRegistration.checkErrorMessage(": Please enter a password.");
        ItPlatformaRegistration.checkErrorMessage(": Этот email уже зарегистрирован. Пожалуйста, введите другой.");
        ItPlatformaRegistration.fillTheFieldEmail(ItPlatformaUser.EMAIL2.getValue());
        ItPlatformaRegistration.pressbuttonRegistration2();
        ItPlatformaRegistration.checkErrorMessage(": Некорректный адрес email.");
        ItPlatformaRegistration.checkErrorMessage(": Please enter a password.");
        ItPlatformaRegistration.fillTheFieldEmail(ItPlatformaUser.EMAIL2.getValue());
        ItPlatformaRegistration.pressbuttonRegistration2();
        ItPlatformaRegistration.checkErrorMessage(": Please enter a password.");
        ItPlatformaRegistration.fillTheFieldPassword(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaRegistration.pressbuttonRegistration2();
        ItPlatformaRegistration.checkErrorMessage(": Please enter a password.");
        ItPlatformaRegistration.fillTheFieldPassword2(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaRegistration.pressbuttonRegistration2();
        ItPlatformaMainPage.checkProfileName();
        ItPlatformaMainPage.sellectElements();
        ItPlatformaMainPage.pressButtonSingOut("Выйти");
    }

    @Test()
    public void checkAuthorization() {
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaAuthorization.pressButtonSingIn();
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaMainPage.checkProfileName();
        ItPlatformaMainPage.sellectElements();
        ItPlatformaMainPage.pressButtonSingOut("Выйти");
    }

    @Test()
    public void checkValidAuthorization() {
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaAuthorization.pressButtonSingIn();
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage(": Вы не ввели имя пользователя.");
        ItPlatformaAuthorization.checkErrorMessage(": Вы не ввели пароль.");
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage(": Вы не ввели пароль.");
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.USER2.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage1("Забыли пароль?");
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.USER2.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage("Неизвестное имя пользователя. Перепроверьте или попробуйте ваш адрес email.");
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.EMAIL.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD2.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage1("Забыли пароль?");
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD2.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage1("Забыли пароль?");
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.EMAIL.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaMainPage.checkProfileName();
        ItPlatformaMainPage.sellectElements();
        ItPlatformaMainPage.pressButtonSingOut("Выйти");
    }

    @Test()
    public void checkValidAuthorizationRememberMe() {
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaAuthorization.pressButtonSingIn();
        ItPlatformaAuthorization.setCheckBoxRememberMe();
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage(": Вы не ввели имя пользователя.");
        ItPlatformaAuthorization.checkErrorMessage(": Вы не ввели пароль.");
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage(": Вы не ввели пароль.");
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage("Неизвестное имя пользователя. Перепроверьте или попробуйте ваш адрес email.");
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.EMAIL.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage(": Вы не ввели пароль.");
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD2.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage1("Забыли пароль?");
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.EMAIL.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaMainPage.checkProfileName();
        ItPlatformaMainPage.sellectElements();
        ItPlatformaMainPage.pressButtonSingOut("Выйти");
    }

    @Test()
    public void checkMainPageBrokenlinks() {
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaMainPage.pressButtonHeader("Sign in");
        ItPlatformaMainPage.checkLoginPage("Войти");
        ItPlatformaMainPage.pressButtonHeader("Pricing");
        ItPlatformaMainPage.checkPricingPage();
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaMainPage.pressButtonHeader("Choose your pack");
        ItPlatformaMainPage.checkChooseYourPackPage();
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaMainPage.pressButtonHeader("Achieve your goal");
        ItPlatformaMainPage.checkAchieveYourGoalPage();
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaMainPage.pressButtonHeader("Your Objective");
        ItPlatformaMainPage.checkYourObjectivePage();
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaMainPage.pressNewesPage("Neque adipiscing an cursus");
        ItPlatformaMainPage.checkOpendNewesPage1();
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaMainPage.pressNewesPage("Litora torqent per conubia");
        ItPlatformaMainPage.checkOpendNewesPage2();
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaMainPage.pressNewesPage("Praesent libro se cursus ante");
        ItPlatformaMainPage.checkOpendNewesPage3();
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaMainPage.pressPageNumbers2();
        ItPlatformaMainPage.checkPageNumbers2("Metus vitae pharetra auctor");

    }
    @DataProvider
    public Object[][] testObjArray() {
        return ExcelUtils.getTableArray("src//test//resources//TestData.xlsx", "Sheet1");
    }

    @Test(dataProvider = "testObjArray1")
    public void checkMainPageTheSearch(String search1, String search2) throws IOException {
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaMainPage.fieldSearch( search1 + search2);
        ItPlatformaMainPage.fieldSearch(Keys.chord(Keys.ENTER));
        ItPlatformaMainPage.resultSearch();
        writeToExcelFile(search1, search2);
    }



}
