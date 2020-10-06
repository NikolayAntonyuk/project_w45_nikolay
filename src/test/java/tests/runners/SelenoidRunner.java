package tests.runners;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import tests.pages.BasePage;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class SelenoidRunner extends BasePage {

    @BeforeClass
    static public void customConfig() throws MalformedURLException {
        Configuration.timeout = 30000;
        Configuration.reportsFolder = "target/screenshots";
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        dc.setBrowserName("chrome");
        dc.setCapability("enableVNC", false);
        dc.setCapability("enableVideo", false);
        dc.setJavascriptEnabled(true);
        setWebDriver(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc));
        getWebDriver().manage().window().setSize(new Dimension(1920, 1080));
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @AfterClass
    public static void tearDown() {
        WebDriverRunner.closeWebDriver();
    }

}