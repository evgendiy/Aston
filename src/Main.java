import Task1.Animal;
import Task1.Bowl;
import Task1.Cat;
import Task1.Dog;
import Task2.Circle;
import Task2.Rectangle;
import Task2.Triangle;


public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Бегемот", 200, 0, 10);
        Cat cat2 = new Cat("Мурзик", 200, 0, 10);
        Cat cat3 = new Cat("Снежок", 200, 0, 10);

        Bowl bowl = new Bowl(10);
        bowl.addFood(15);

        Cat[] cats = {cat1, cat2, cat3};
        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        cat1.run(50);
        cat1.swim(0);

        Dog dog1 = new Dog("Butcher", 500, 10);
        dog1.run(100);
        dog1.swim(10);

        System.out.println(Dog.getDogCount());
        System.out.println(Cat.getCatCount());
        System.out.println(Animal.getCount());

        Circle circle = new Circle("red", "purple", 3.3);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle("white", "black", 5, 5);
        System.out.println(rectangle.toString());

        Triangle triangle = new Triangle("white", "black", 3, 4, 5);
        System.out.println(triangle.toString());
    }
}