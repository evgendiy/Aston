package Task2;

public interface BaseCircle {
    default double perimeter(double radius) {
        return Math.PI * 2 * radius;
    }

    default double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
