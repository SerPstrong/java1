package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Food: " + food);
    }

    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean addFood(int amount) {
        if (amount >= 0) {
            food += amount;
            return true;
        }else {
            return false;
        }
    }

}
