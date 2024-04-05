package Task2;

public interface BaseRectangle {

    default double perimeter(double side1, double side2) {
        return 2 * (side1 + side2);
    }

    default double area(double side1, double side2) {
        return side1 * side2;
    }
}
