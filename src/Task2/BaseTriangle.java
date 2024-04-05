package Task2;

public interface BaseTriangle {
    default double perimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    default double area(double side1, double side2, double side3) {
        double p = perimeter(side1, side2, side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}
