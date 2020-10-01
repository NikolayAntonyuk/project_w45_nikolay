package tests.runners;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import tests.pages.BasePage;

import java.net.MalformedURLException;

public class Debug extends BasePage {
    @Parameters({"browserName"})
    @BeforeClass
    static public void customConfig(@Optional String browserName) throws MalformedURLException {
        Configuration.timeout = 30000;
        Configuration.reportsFolder = "target/screenshots";
        Configuration.browser = browserName;
        Configuration.browserCapabilities.setCapability("enableVNC", false);
        Configuration.browserCapabilities.setCapability("enableVideo", false);
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.startMaximized = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @AfterClass
    public static void tearDown() {
        WebDriverRunner.closeWebDriver();
    }

}
