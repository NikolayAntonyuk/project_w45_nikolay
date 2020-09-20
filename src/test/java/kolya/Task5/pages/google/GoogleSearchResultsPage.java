package kolya.Task5.pages.google;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static tests.common.CommonSteps.checkUrl;
import static tests.common.CommonSteps.getAndAttachScreenshot;
import static tests.logger.CustomLogger.logger;

public class GoogleSearchResultsPage {
    String searchResultXPath = "//div[@class='g']//h3";

    @Step
    public void checkSearchResults(String text) {
        checkUrl("search");
        $(byXpath(searchResultXPath + "[text()='" + text + "']")).shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("value: " + text + " - ok");
    }

}
