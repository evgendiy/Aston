import java.util.Arrays;

public class HomeworkLecture4 {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = -2;

        String message = (a + b) >= 0 ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(message);
    }

    public static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 2;
        int b = -2;
        String message = a >= b ? "a >= b" : "a < b";
        System.out.println(message);
    }

    public static boolean checkSumRange(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    public static void checkNumber(int number) {
        String message = number >= 0 ? "Число положительное" : "Число отрицательное";
        System.out.println(message);
    }

    public static boolean getResult(int number) {
        return number < 0;
    }

    public static void printLine(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean checkLeapYear(int year) {
        if (year % 4 == 0 & year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void replaceArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void initArray() {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void increaseArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void diagonalizeArray() {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][i] = 1;
                array[i][array.length - i - 1] = 1;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] arrayCreation(int len, int initialValue) {
        if (len < 0) {
            throw new IllegalArgumentException("incorrect length");
        }
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
}

