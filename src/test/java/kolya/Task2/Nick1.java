package kolya.Task2;

public class Nick1 {

    public static void main(String[] args) {
        calculete(5, 10);
        calculete(50, 2);
    }

    public static void calculete(int a, int b) {
        if (a * b == 100) {
            double resultOfFirstLoop = 0;
            for (double i = 1; i <= 5; i++) {
                if (i == 1) {
                    resultOfFirstLoop = a / b;
                    System.out.println(a + " * " + b + " = 100. " + "Loop number " + i + ". " + a + " / " + b + " = " +
                            resultOfFirstLoop);
                } else  {
                    System.out.println(a + " * " + b + " = 100. " + "Loop number " + i + ". " + resultOfFirstLoop + " / " + b + " = " +
                            resultOfFirstLoop / b);
                }
            }
        } else {
            System.out.println(a + " * " + b + " ≠ 100. " + "The loop will not be run!");
        }
    }
}
