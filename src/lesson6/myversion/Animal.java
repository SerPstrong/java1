package lesson6.myversion;

public class Animal {
    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    static private int animalCount = 0;

    public static int getAnimalCount() {
        return animalCount;
    }

    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " успешно пробежала " + dist + " м");
        } else {
            System.out.println(type + " " + name + " столько бежать не может ");
        }
    }

    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " успешно прыгнул " + height + " м");
        } else {
            System.out.println(type + " " + name + " столько прыгать не может ");
        }
    }

    public void swim(int dist) {
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " не умеет плавать ");
            return;
        }
        if (dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " успешно проплыла " + dist + " м");
        } else {
            System.out.println(type + " " + name + " столько плыть не может ");
        }
    }

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        animalCount++;
    }

    public Animal(String type, String name, int maxRunDistance,
                  int maxJumpHeight, int maxSwimDistance, int dispersionPercent) {

        this(type, name, maxRunDistance, maxJumpHeight, maxSwimDistance);

        this.maxRunDistance *= Math.random() * dispersionPercent / 100 + 1;
        this.maxJumpHeight *= Math.random() * dispersionPercent / 100 + 1;
        this.maxSwimDistance *= Math.random() * dispersionPercent / 100 + 1;
    }
}
