package kolya.Task4;

import java.util.Scanner;


/*А вот и задачка про двумерные массивы:

        Write a program which print out 2 dimensional arrays depending on the size which user set via console:

        Output ->

        Enter the size: 3

        [[5, 4, 3],

        [6, 9, 2],

        [7, 8, 1]]



        Output ->

        Enter the size: 5

        [[11, 10, 9, 8, 7, 6],

        [12, 27, 26, 25, 24, 5],

        [13, 28, 35, 34, 23, 4],

        [14, 29, 36, 33, 22, 3],

        [15, 30, 31, 32, 21, 2],

        [16, 17, 18, 19, 20, 1]]*/
public class Task4 {
    public static void main(String[] args) {
        fillArray();
    }
    public static void fillArray() {
        System.out.println("Please input an one integer for 2d array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] array = new int[size][size];
        //С помощью переменной s задаются числа внутри массива начиная с 1.
        int s = 1;
        //Заполняем периметр массива против часовой стрелке.
        for (int x = size - 1; x >= 0; x--) {
            array[x][size - 1] = s;
            s++;
        }
        for (int y = size - 2; y >= 1; y--) {
            array[0][y] = s;
            s++;
        }
        for (int x = 0; x < size; x++) {
            array[x][0] = s;
            s++;
        }
        for (int y = 1; y < size - 1; y++) {
            array[size - 1][y] = s;
            s++;
        }
        //Периметр заполнен. Продолжаем заполнять массив и задаём
        //координаты ячейки, которую необходимо заполнить следующей.
        int c = 3;
        int d = 3;

        while (s < size * size) {
            //В Java инициализированный интовый массив заполняется нулями.
            //Периметр мы заполнили числами, отличными от нулей.
            //Следующие циклы поочерёдно работают, заполняя ячейки.
            //Вложенный цикл останавливается, если следующая ячейка имеет
            //значение, отличное от ноля. Ячейка, на которой остановился
            //цикл, не заполняется.

            //Движемся вверх.
            while (array[c - 1][d] == 0) {
                array[c][d] = s;
                s++;
                c--;
            }
            //Движемся влево.
            while (array[c][d - 1] == 0) {
                array[c][d] = s;
                s++;
                d--;
            }
            //Движемся вниз.
            while (array[c + 1][d] == 0) {
                array[c][d] = s;
                s++;
                c++;
            }
            //Движемся вправо.
            while (array[c][d + 1] == 0) {
                array[c][d] = s;
                s++;
                d++;
            }
        }
        //При данном решении в центре всегда остаётся незаполненная ячейка.
        //Убираем её при помощи следующего цикла.
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                if (array[x][y] == 0) {
                    array[x][y] = s;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

