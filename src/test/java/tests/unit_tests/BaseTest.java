package tests.unit_tests;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
    Calculator calculator = new Calculator();

    @Parameters({"browserName", "country"})
    @BeforeMethod
    public void prepareProject(@Optional String browserName, @Optional String country) {
        System.out.println("Environments:");
        if (browserName != null && browserName.equals("Chrome")) {
            System.out.println("Browser name: " + browserName);
        } else {
            System.out.println("Browser name: " + browserName + " not found");
        }
        if (country != null && country.equals("SE")) {
            System.out.println("Country: " + country);
        } else {
            System.out.println("Country: " + country + " not found");
        }
        System.out.println("Before method");
    }

    @AfterMethod
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}
