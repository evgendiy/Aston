package Task1;

public class Cat extends Animal {

    private static int catCount;
    private boolean satiety;
    private int capacity;

    public Cat(String name, int runLimit, int swimLimit, int capacity) {
        super(name, runLimit, swimLimit);
        this.satiety = false;
        this.capacity = capacity;
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void swim(int swimLimit) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl) {
        if (capacity <= bowl.getAmount()) {
            System.out.println("Кот " + name + " поел");
            bowl.setAmount(bowl.getAmount() - capacity);
            satiety = true;
        } else {
            System.out.println("Кот " + name + " презрительно смотрит на миску и не ест.");
        }
    }
}
