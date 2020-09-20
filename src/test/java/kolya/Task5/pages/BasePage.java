package kolya.Task5.pages;

import kolya.Task5.MKOffersPage;
import kolya.Task5.pages.MK.MKLoginPage;
import kolya.Task5.pages.MK.MKMinePage;
import kolya.Task5.pages.MK.MKPasswordPage;
import tests.pages.google.GoogleDoodlePage;
import tests.pages.google.GoogleMainPage;
import tests.pages.google.GoogleSearchResultsPage;
import tests.pages.stackoverflow.StackOverFlowLoginPage;
import tests.pages.stackoverflow.StackOverFlowMainPage;

public class BasePage {
    public GoogleMainPage googleMainPage = new GoogleMainPage();
    public tests.pages.google.GoogleDoodlePage googleDoodlePage = new GoogleDoodlePage();
    public GoogleSearchResultsPage googleSearchResultsPage = new GoogleSearchResultsPage();
    public tests.pages.stackoverflow.StackOverFlowMainPage stackOverFlowMainPage = new StackOverFlowMainPage();
    public tests.pages.stackoverflow.StackOverFlowLoginPage stackOverFlowLoginPage = new StackOverFlowLoginPage();

    public MKPasswordPage MKPasswordPage = new MKPasswordPage();
    public MKLoginPage MKLoginPage = new MKLoginPage();
    public MKMinePage MKMinePage = new MKMinePage();
    public MKOffersPage MKOffersPage = new MKOffersPage();



}
