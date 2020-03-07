package lesson7;

public class Cat {
    private String name;
    private boolean satiety;


    public Cat(String name) {
        this.name = name;
        satiety = false;
    }

    public void eat(Plate plate) {
        if(plate.decreaseFood(10)){
            System.out.println("Cat " + name + " eat...");
            satiety = true;
        }else {
            System.out.println("Cat " + name + "  no eat");
        }

    }

    public String getName() {
        return name;
    }

    public void fear(Dog dog){
        System.out.println("Cat "+name+ " fear dog "+ dog.getName());
    }

    public boolean isSatiety() {
        return satiety;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                '}';
    }
}
