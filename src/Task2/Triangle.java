package Task2;

public class Triangle extends Figure implements BaseTriangle {
    public double side1;
    public double side2;
    public double side3;


    public Triangle(String fillColor, String borderColor, double side1, double side2, double side3) {
        super(fillColor, borderColor);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Фигура: треугольник" + "\n" + "Цвет заливки: " + fillColor + "\n" +
                "Цвет границы: " + borderColor + "\n" +
                "Периметр: " + perimeter(side1, side2, side3) + "\n" +
                "Площадь: " + area(side1, side2, side3);
    }
}
