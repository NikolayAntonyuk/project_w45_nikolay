package kolya.Task5.runners;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.testng.ScreenShooter;
import io.qameta.allure.selenide.AllureSelenide;
import kolya.Task5.pages.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Debug extends BasePage {

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        Configuration.startMaximized = true;
        Configuration.reportsFolder = "target/screenshots";
        Configuration.timeout = 10000;
        ScreenShooter.captureSuccessfulTests = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}
