package tests.unit_tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.listeners.CustomListener;

import static tests.logger.CustomLogger.logger;

@Listeners(CustomListener.class)
public class CalculatorTests extends BaseTest {

    @Test(groups = "CalculatorTests", priority = 1)
    public void checkSum(@Optional String msg) {
        int actualResult = calculator.sum(2, 2);
        int expectedResult = 4;
        Assert.assertEquals(expectedResult, actualResult);
        logger.info(msg);
    }

    @Test(groups = "CalculatorTests", priority = 2)
    public void checkSubtraction() {
        int actualResult = calculator.subtraction(2, 2);
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("ok");
    }

    @Test(groups = "CalculatorTests", priority = 3)
    public void checkMultiplication() {
        int actualResult = calculator.multiplication(2, 3);
        int expectedResult = 6;
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("ok");
    }

    @Test(groups = "CalculatorTests", priority = 4)
    public void checkDivision() {
        int actualResult = calculator.division(2, 2);
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("ok");
    }

}
