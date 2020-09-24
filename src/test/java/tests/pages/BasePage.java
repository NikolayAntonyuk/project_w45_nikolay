package tests.pages;

import tests.pages.itplatforma.ItPlatformaAuthorization;
import tests.pages.itplatforma.ItPlatformaMainPage;
import tests.pages.itplatforma.ItPlatformaRegistration;

public class BasePage {
    public ItPlatformaMainPage ItPlatformaMainPage = new ItPlatformaMainPage();
    public ItPlatformaAuthorization ItPlatformaAuthorization = new ItPlatformaAuthorization();
    public ItPlatformaRegistration ItPlatformaRegistration = new ItPlatformaRegistration();
}
