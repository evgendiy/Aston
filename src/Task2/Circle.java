package Task2;

public class Circle extends Figure implements BaseCircle {
    public double radius;

    public Circle(String fillColor, String borderColor, double radius) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Фигура: круг" + "\n" + "Цвет заливки: " + fillColor + "\n" +
                "Цвет границы: " + borderColor + "\n" +
                "Периметр: " + perimeter(radius) + "\n" +
                "Площадь: " + area(radius);
    }
}
