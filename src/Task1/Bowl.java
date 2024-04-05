package Task1;

public class Bowl {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Bowl(int amount) {
        this.amount = amount;
    }

    public void addFood(int food){
        amount+=food;
    }
}
