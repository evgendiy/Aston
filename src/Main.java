import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[][] array = new String[4][4];
        for (String[] strings : array) {
            Arrays.fill(strings, "1");
        }

        try {
            System.out.println("Сумма элементов массива: " + sumArray(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length == 4) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].length != 4) {
                    throw new MyArraySizeException("Размер массива не соответствует условию");
                }
            }
        } else {
            throw new MyArraySizeException("Размер массива не соответствует условию");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Невалидные данные: ячейка [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}