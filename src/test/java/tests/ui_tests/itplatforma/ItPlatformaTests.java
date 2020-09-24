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
        //ItPlatformaMainPage.pressButtonSingOut("Выйти");
    }

    @Test(priority = 2)
    public void checkValidReg() {
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaRegistration.pressButtonSingIn();
        ItPlatformaRegistration.pressButtonRegistration();
        ItPlatformaRegistration.pressbuttonRegistration2();
        ItPlatformaRegistration.checkErrorMessage1();
        ItPlatformaRegistration.checkErrorMessage2();
        ItPlatformaRegistration.checkErrorMessage3();
        ItPlatformaRegistration.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaRegistration.pressbuttonRegistration2();
        ItPlatformaRegistration.checkErrorMessage2();
        ItPlatformaRegistration.checkErrorMessage3();
        ItPlatformaRegistration.checkErrorMessage4();
        ItPlatformaRegistration.fillTheFieldUser(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaRegistration.fillTheFieldUser(ItPlatformaUser.USER2.getValue());
        ItPlatformaRegistration.pressbuttonRegistration2();
        ItPlatformaRegistration.checkErrorMessage2();
        ItPlatformaRegistration.checkErrorMessage3();
        ItPlatformaRegistration.fillTheFieldEmail(ItPlatformaUser.EMAIL.getValue());
        ItPlatformaRegistration.pressbuttonRegistration2();
        ItPlatformaRegistration.checkErrorMessage3();
        ItPlatformaRegistration.checkErrorMessage5();
        ItPlatformaRegistration.fillTheFieldEmail(ItPlatformaUser.EMAIL2.getValue());
        ItPlatformaRegistration.pressbuttonRegistration2();
        ItPlatformaRegistration.checkErrorMessage7();
        ItPlatformaRegistration.checkErrorMessage3();
        ItPlatformaRegistration.fillTheFieldEmail(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaRegistration.fillTheFieldEmail(ItPlatformaUser.EMAIL2.getValue());
        ItPlatformaRegistration.pressbuttonRegistration2();
        ItPlatformaRegistration.checkErrorMessage3();
        ItPlatformaRegistration.fillTheFieldPassword(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaRegistration.pressbuttonRegistration2();
        ItPlatformaRegistration.checkErrorMessage6();
        ItPlatformaRegistration.fillTheFieldPassword2(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaRegistration.pressbuttonRegistration2();
        ItPlatformaMainPage.checkProfileName();
        //ItPlatformaMainPage.pressButtonSingOut("Выйти");
    }

    @Test(priority = 3)
    public void checkAuthorization() {
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaAuthorization.pressButtonSingIn();
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaMainPage.checkProfileName();
        // ItPlatformaMainPage.pressButtonSingOut("Выйти");
    }
    @Test(priority = 4)
    public void checkValidAuthorization() {
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaAuthorization.pressButtonSingIn();
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage1();
        ItPlatformaAuthorization.checkErrorMessage2();
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage2();
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage3();
        ItPlatformaAuthorization.fillTheFieldUser(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldPassword(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.EMAIL.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage2();
        ItPlatformaAuthorization.fillTheFieldUser(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldPassword(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD2.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage4();
        ItPlatformaAuthorization.fillTheFieldUser(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldPassword(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.EMAIL.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaMainPage.checkProfileName();
        // ItPlatformaMainPage.pressButtonSingOut("Выйти");
    }
    @Test(priority = 5)
    public void checkValidAuthorizationRememberMe() {
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaAuthorization.pressButtonSingIn();
        ItPlatformaAuthorization.setCheckBoxRememberMe();
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage1();
        ItPlatformaAuthorization.checkErrorMessage2();
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage2();
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage3();
        ItPlatformaAuthorization.fillTheFieldUser(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldPassword(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.EMAIL.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage2();
        ItPlatformaAuthorization.fillTheFieldUser(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldPassword(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD2.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaAuthorization.checkErrorMessage4();
        ItPlatformaAuthorization.fillTheFieldUser(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldPassword(Keys.chord((Keys.CONTROL + "a") + Keys.DELETE));
        ItPlatformaAuthorization.fillTheFieldUser(ItPlatformaUser.EMAIL.getValue());
        ItPlatformaAuthorization.fillTheFieldPassword(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaAuthorization.pressButtonLogin();
        ItPlatformaMainPage.checkProfileName();
        // ItPlatformaMainPage.pressButtonSingOut("Выйти");
    }

}
