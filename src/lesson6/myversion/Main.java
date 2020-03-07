package lesson6.myversion;

public class Main {
    public static void main(String[] args) {
        Animal[] animals={
                new Cat("Barsik"),
                new Dog("Tuzik"),
                new Cat("Tigr", 50)
        };

        for (int i = 0; i <animals.length ; i++) {
            animals[i].jump(1);
            animals[i].run(210);
            animals[i].swim(5);
        }

        System.out.println(Animal.getAnimalCount());
        System.out.println(Cat.getAnimalCount());


    }
}
