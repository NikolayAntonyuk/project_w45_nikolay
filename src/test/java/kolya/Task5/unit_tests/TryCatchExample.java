package kolya.Task5.unit_tests;

import static java.lang.Thread.sleep;

public class TryCatchExample {

    public static void main(String[] args) throws InterruptedException {
        try {
            int[] array = new int[5];
            System.out.println(array[5]);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        for (int i = 1; i <= 10; i++) {
            sleep(1000);
            System.out.println(i);
        }
    }

}
