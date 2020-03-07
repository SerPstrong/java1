package lesson6.animals;

public class SuperCat extends Cat {

    public SuperCat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String toString() {
//        return super.toString();
        return "SuperCat : "+ name + " " + color + " " + age;
    }
}
