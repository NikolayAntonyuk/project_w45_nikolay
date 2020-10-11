package tests.runners;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import tests.pages.BasePage;

public class Debug extends BasePage {
    @Parameters({"browserName"})
    @BeforeMethod(alwaysRun = true)
    static public void customConfig(@Optional String browserName)  {
        Configuration.timeout = 30000;
        Configuration.reportsFolder = "target/screenshots";
        if (browserName != null) {
            Configuration.browser = browserName;
        }
        Configuration.startMaximized = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @AfterMethod(alwaysRun = true)
    public static void tearDown() {
        WebDriverRunner.closeWebDriver();
    }
}
