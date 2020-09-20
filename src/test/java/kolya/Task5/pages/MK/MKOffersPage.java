package kolya.Task5;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static tests.common.CommonSteps.checkUrl;
import static tests.common.CommonSteps.getAndAttachScreenshot;
import static tests.logger.CustomLogger.logger;

public class MKOffersPage {
    String buttonXPath = "//div[@class='info-block__label info-block__label--footer']//button";
        //div[@class="info-block__label" and text()='']
    String searchResultXPath = "//div[@class='g']//h3";

    @Step
    public void checkSearchResults(String text) {
        checkUrl("search");
        $(byXpath(searchResultXPath + "[text()='" + text + "']")).shouldBe(Condition.visible);
        getAndAttachScreenshot();
        logger.info("value: " + text + " - ok");
    }

    @Step
    public void pressButton(String buttonText) {
        $(byXpath(buttonXPath + "[text()='" + buttonText + "']")).click();
        logger.info(buttonText + " - ok");
    }

}
