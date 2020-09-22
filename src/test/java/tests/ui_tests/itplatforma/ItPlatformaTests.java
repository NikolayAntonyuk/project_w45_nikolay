package tests.ui_tests.itplatforma;

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
    @Test
    public void checkRegestration(){
        open(Projects.ITPLATFORMA_MAIN_PAGE.getUrl());
        ItPlatformaRegistration.pressButtonSingIn();
        ItPlatformaRegistration.pressButtonRegistration();
        ItPlatformaRegistration.fillTheFieldUser(ItPlatformaUser.USER.getValue());
        ItPlatformaRegistration.fillTheFieldEmail(ItPlatformaUser.EMAIL.getValue());
        ItPlatformaRegistration.fillTheFieldPassword(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaRegistration.fillTheFieldPassword2(ItPlatformaUser.PASSWORD.getValue());
        ItPlatformaRegistration.pressbuttonRegistration2();

    }
    @Test
    public void checkAutorization(){

    }

}
