package Task1;

public abstract class Animal {

    protected String name;
    private static int animalCount;
    protected int runLimit;
    protected int swimLimit;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }

    public static int getCount() {
        return animalCount;
    }

    public abstract void swim(int swimLimit);

    public void run(int distance) {
        if (distance >= 0 && distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать столько.");
        }
    }

}
