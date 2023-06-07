import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 10)); // true
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false
        System.out.println(isSumBetween10And20(2, 19)); // false
        System.out.println(isSumBetween10And20(8, 2)); // true



        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(0)); // false
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd
        printString("qwerty", 3); // qwertyqwertyqwerty


        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(100));
        System.out.println(isLeapYear(396));
        System.out.println(isLeapYear(9900));
        System.out.println(isLeapYear(1984));



        int[] arr = createArray(5, 10);
        System.out.println(Arrays.toString(arr)); // [10, 10, 10, 10, 10]

        int[] arr_1 = createArray(10, 4);
        System.out.println(Arrays.toString(arr_1)); // [4,4,4,4,4,4,4,4,4,4]

        int[] arr_2 = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        changeArray(arr_2);
        System.out.println(Arrays.toString(arr_2)); // [0, 0, 1, 1, 0, 1, 0, 0, 1, 1]

        int[] arr_3 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessSix(arr_3);
        System.out.println(Arrays.toString(arr_3)); // [2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2]

        int[][] arr_4 = diagonalArray(5);
        System.out.println(Arrays.deepToString(arr_4)); // [4,4,4,4,4,4,4,4,4,4]

    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        if (10 <= a + b & a + b <= 20) {
            return true;
        }
        return false;
    }

    private static boolean isPositive(int x) {
        if (x > 0) {
            return true;
        }
        return false;
    }

    private static void printString(String source, int repeat) {
        String res = "";
        for (int i = 0; i < repeat; i++) {
            res += source;
        }
        System.out.println(res);

    }

    private static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }

    private static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    private static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
            }
        }

    /**
     * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    private static void multiplyLessSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] < 6) ? arr[i] * 2: arr[i];
        }
    }

    /**
     * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * * Также заполнить элементы побочной диагонали
     */
    private static int[][] diagonalArray(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (i == j || i + j == size - 1) ? 1: 0;
            }
        }
        return arr;
    }



}
