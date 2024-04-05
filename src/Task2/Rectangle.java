package Task2;

public class Rectangle extends Figure implements BaseRectangle {
    public double side1;
    public double side2;

    public Rectangle(String fillColor, String borderColor, double side1, double side2) {
        super(fillColor, borderColor);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public String toString() {
        if (side1 != side2) {
            return "Фигура: прямоугольник" + "\n" + "Цвет заливки: " + fillColor + "\n" +
                    "Цвет границы: " + borderColor + "\n" +
                    "Периметр: " + perimeter(side1, side2) + "\n" +
                    "Площадь: " + area(side1, side2);
        } else {
            return "Фигура: квадрат" + "\n" + "Цвет заливки: " + fillColor + "\n" + //частный случай прямоугольника
                    "Цвет границы: " + borderColor + "\n" +
                    "Периметр: " + perimeter(side1, side2) + "\n" +
                    "Площадь: " + area(side1, side2);
        }
    }
}
