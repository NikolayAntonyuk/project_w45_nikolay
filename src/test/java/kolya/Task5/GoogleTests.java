package kolya.Task5;

import kolya.Task5.data.Projects;
import kolya.Task5.runners.Debug;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class GoogleTests extends Debug {

    @Test
    public void checkGoogleSearch() {
        open(Projects.GOOGLE_MAIN_PAGE.getUrl());
        googleMainPage.fillTheFieldSearch("Kolya hello!!!");
        googleMainPage.pressButton("Поиск в Google");
        googleSearchResultsPage.checkSearchResults("DJ Kolya Funk – Hello! 2017 (Russian House Band New Year ...");
    }

    @Test
    public void checkDoodlesPage() {
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
