package tests.pages;

import tests.pages.google.GoogleDoodlePage;
import tests.pages.google.GoogleMainPage;
import tests.pages.google.GoogleSearchResultsPage;
import tests.pages.itplatforma.ItPlatformaAutorization;
import tests.pages.itplatforma.ItPlatformaMainPage;
import tests.pages.itplatforma.ItPlatformaRegistration;
import tests.pages.stackoverflow.StackOverFlowLoginPage;
import tests.pages.stackoverflow.StackOverFlowMainPage;

public class BasePage {
    public GoogleMainPage googleMainPage = new GoogleMainPage();
    public GoogleDoodlePage googleDoodlePage = new GoogleDoodlePage();
    public GoogleSearchResultsPage googleSearchResultsPage = new GoogleSearchResultsPage();
    public StackOverFlowMainPage stackOverFlowMainPage = new StackOverFlowMainPage();
    public StackOverFlowLoginPage stackOverFlowLoginPage = new StackOverFlowLoginPage();

    public ItPlatformaMainPage ItPlatformaMainPage = new ItPlatformaMainPage();
    public ItPlatformaAutorization ItPlatformaAutorization = new ItPlatformaAutorization();
    public ItPlatformaRegistration ItPlatformaRegistration = new ItPlatformaRegistration();
}
