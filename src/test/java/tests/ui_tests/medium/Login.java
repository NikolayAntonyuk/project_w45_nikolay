package tests.ui_tests.medium;

import org.testng.annotations.Test;
import tests.data.Projects;
import tests.data.UserStackOverFlow;
import tests.runners.Debug;

import static com.codeborne.selenide.Selenide.open;

public class Login extends Debug {

    @Test
    public void checkLogin() {
        open(Projects.STACKOVERFLOW_MAIN_PAGE.getUrl());
        stackOverFlowMainPage.pressButtonSignIn();
        stackOverFlowLoginPage.fillTheFieldEmail(UserStackOverFlow.EMAIL.getValue());
        stackOverFlowLoginPage.fillTheFieldPassword(UserStackOverFlow.PASSWORD.getValue());
        stackOverFlowLoginPage.pressButtonLogin();
        stackOverFlowMainPage.checkProfileIcon();
    }

}
