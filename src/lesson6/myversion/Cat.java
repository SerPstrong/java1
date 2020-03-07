package lesson6.myversion;

public class Cat extends Animal {

    private static int animalCount;

    static {
        animalCount = 0;
    }

    public Cat(String name) {
        super("Кот", name, 200, 2, 0);

        animalCount++;
    }

    public Cat(String name, int dispersionPercent) {
        super("Кот", name, 200, 2,
                0, dispersionPercent);

        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
