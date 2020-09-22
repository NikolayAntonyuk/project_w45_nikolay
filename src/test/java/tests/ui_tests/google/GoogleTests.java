package tests.ui_tests.google;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.data.Projects;
import tests.runners.Debug;
import tests.utils.ExcelUtils;

import static com.codeborne.selenide.Selenide.open;

public class GoogleTests extends Debug {

    @DataProvider
    public Object[][] testObjArray1() {
        return ExcelUtils.getTableArray("src//test//resources//TestData.xlsx", "Sheet1");
    }

    @Test(dataProvider = "testObjArray1")
    public void test1(String var1, String var2) {
        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
    }

    @Test(dataProvider = "testObjArray1")
    public void checkGoogleSearch1(String var1, String var2) {
        open(Projects.GOOGLE_MAIN_PAGE.getUrl());
        googleMainPage.fillTheFieldSearch("var1: " + var1 + "var2:" + var2);
        googleMainPage.pressButton("Поиск в Google");
        googleSearchResultsPage.checkSearchResults("DJ Kolya Funk – Hello! 2017 (Russian House Band New Year ...");
    }

    @Test
    public void checkDoodlesPage2() {
        open(Projects.GOOGLE_MAIN_PAGE.getUrl());
        googleMainPage.pressButton("Поиск в Google");
        googleMainPage.pressButton("Мне повезёт!");
        googleDoodlePage.checkDoodlesPage();
    }

    @Test
    public void checkArchiveDoodlesPage() {
        open(Projects.GOOGLE_MAIN_PAGE.getUrl());
//        mainPage.pressButton();
        googleDoodlePage.pressButtonArchiveDoodles();
    }

}
