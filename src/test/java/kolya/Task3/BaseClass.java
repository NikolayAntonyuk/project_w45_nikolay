package kolya.Task3;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import tests.unit_tests.Calculator;

public class BaseClass {
    public Calculator calculator = new Calculator();
    public PrepareTestData prepareTestData = new PrepareTestData();


    @BeforeMethod
    public void setPrepareTestData() {
        prepareTestData.fillArrayInt();
        prepareTestData.fillArrayString();
    }

    @BeforeClass
    public void prepareProject() {
        System.out.println("Prepare project");
    }
}
