package tests.ui_tests.itplatforma;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.data.ItPlatformaUser;
import tests.data.Projects;
import tests.runners.Debug;
import tests.utils.ExcelUtils;

import static com.codeborne.selenide.Selenide.open;

public class ItPlatformaTests extends Debug {

    @DataProvider
    public Object[][] testObjArray1() {
        return ExcelUtils.getTableArray("src//test//resources//TestData.xlsx", "Sheet1");
    }

    @Test(priority = 1)
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

    @Test(priority = 2)
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
        ItPlatformaRegistration.fillTheFieldUser(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
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
        ItPlatformaRegistration.fillTheFieldEmail(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
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

    @Test(priority = 3)
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

    @Test(priority = 4)
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
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage("Неизвестное имя пользователя. Перепроверьте или попробуйте ваш адрес email.");
        ItPlatformaAuthorization.fillTheFieldUser(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldPassword(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.EMAIL.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage(": Вы не ввели пароль.");
        ItPlatformaAuthorization.fillTheFieldUser(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldPassword(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD2.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage1("Забыли пароль?");
        ItPlatformaAuthorization.fillTheFieldUser(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldPassword(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.EMAIL.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaMainPage.checkProfileName();
        ItPlatformaMainPage.sellectElements();
        ItPlatformaMainPage.pressButtonSingOut("Выйти");
    }

    @Test(priority = 5)
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
        ItPlatformaAuthorization.fillTheFieldUser(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldPassword(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.EMAIL.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage(": Вы не ввели пароль.");
        ItPlatformaAuthorization.fillTheFieldUser(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldPassword(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD2.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage1("Забыли пароль?");
        ItPlatformaAuthorization.fillTheFieldUser(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldPassword(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.EMAIL.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaMainPage.checkProfileName();
        ItPlatformaMainPage.sellectElements();
        ItPlatformaMainPage.pressButtonSingOut("Выйти");
    }

    @Test(priority = 6)
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
        ItPlatformaMainPage.checkPageNumbers2();
        ItPlatformaMainPage.pressNewesPage("Metus vitae pharetra auctor");
        ItPlatformaMainPage.checkOpendNewesPage4();
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaMainPage.pressPageNumbers2();
        ItPlatformaMainPage.pressNewesPage("Interdum magna augue eget");
        ItPlatformaMainPage.checkOpendNewesPage5();
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaMainPage.pressPageNumbers2();
        ItPlatformaMainPage.pressNewesPage("Torquent per conubia nostra");
        ItPlatformaMainPage.checkOpendNewesPage6();
    }

    @Test(priority = 7)
    public void checkMainPageTheSearch() {
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaMainPage.fillTheSearch();



        }


    }

}
