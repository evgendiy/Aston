package Task1;

public class Dog extends Animal{
    private static int dogCount;

    public static int getDogCount() {
        return dogCount;
    }

    public Dog(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
        dogCount++;
    }

    @Override
    public void swim(int distance) {
        if (distance >= 0 && distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть столько.");
        }
    }
}
