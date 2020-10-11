package tests.ui_tests;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.screenshot;
import static tests.common.CommonSteps.getAndAttachScreenshot;

public class BrowserStackSampleTest {
  public static final String USERNAME = "nickantonyuk1";
  public static final String AUTOMATE_KEY = "EkqZsYkAEmSzk2d8sJ2J";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
  public static void main(String[] args) throws Exception {
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("os", "Windows");
    caps.setCapability("os_version", "10");
    caps.setCapability("browser", "Chrome");
    caps.setCapability("browser_version", "81");
    caps.setCapability("name", "nickantonyuk1's First Test");
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    WebDriverRunner.setWebDriver(driver);
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    open("https://it-platforma.website/");
    getAndAttachScreenshot();
    System.out.println(driver.getTitle());
    driver.quit();
  }
}