public class Factorial {

    public long factorialCalc(int number) {
        long factorial = 1;
        if (number < 0) {
            throw new IllegalArgumentException("Невалидные данные");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }
}