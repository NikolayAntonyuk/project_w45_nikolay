package kolya.Task3;

import org.testng.Assert;
import org.testng.annotations.Test;
//import tests.BaseClass;

public class Test3 extends BaseClass {
    @Test
    public void verifyArrayList() {
        for (int a = 0; a < prepareTestData.getArrayList2().size(); a++) {
            System.out.println("ArrayList value: " + prepareTestData.getArrayList2().get(a));
            Assert.assertEquals(prepareTestData.getArrayList2().get(a), String.valueOf(prepareTestData.getArrayList1().get(a)));
        }
    }
}
