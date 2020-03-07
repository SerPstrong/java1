package lesson6.animals;

public class Dog extends Animal{

    public Dog(String name, String color, int age) {
        super(name, color, age);
//        System.out.println("constructor Dog ");
    }

    @Override
    public void voice() {
        System.out.println(name+" : gav gav!");
    }
}
