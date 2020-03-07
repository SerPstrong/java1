package lesson6;

import lesson6.animals.Animal;

public class Duck extends Animal {

    public Duck(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println(name + " krya!");
    }
}
