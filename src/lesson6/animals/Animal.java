package lesson6.animals;

public class Animal {
    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
//        System.out.println("constructor Animal ");
    }

    public Animal() {
    }

    public void jump() {
        System.out.println(name + " jump");
    }

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public void sleep(){
        System.out.println(name+" sleep...  ...  ....");
    }

    public void voice(){
        System.out.println("звук какой то издалось...");
    };


}
