package kolya.Task5.ui_tests.medium;

import kolya.Task5.data.UserStackOverFlow;
import kolya.Task5.data.Projects;
import kolya.Task5.runners.Debug;
import org.testng.annotations.Test;

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
