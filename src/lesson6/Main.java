package lesson6;

import lesson6.animals.*;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("Barsik", "white", 3);

//        cat.jump();
//        cat.info();
//        cat.sleep();

//        Dog dog = new Dog("Tuzik", "black", 2);
//        dog.jump();
//        dog.info();
//        dog.sleep();

//        SuperCat superCat = new SuperCat("Barsik","white", 3);

//        Cow cow = new Cow("Zorka", "whiteBlack", 4);

//        cat.voice();
//        dog.voice();
//        cow.voice();

//        final int a = 5;


//        Animal animal1 = new Cat("Barsik", "white", 3);
//        Animal animal2 = new Dog("Tuzik", "black", 2);
//        Animal animal3 = new Cow("Zorka", "whiteBlack", 4);
//
//        animal1.voice();
//        animal2.voice();
//        animal3.voice();

//        Animal[] animals = {
//                new Cat("Barsik", "white", 3),
//                new Dog("Tuzik", "black", 2),
//                new Cat("Myrzik", "red", 5),
//                new Cow("Zorka", "whiteBlack", 4)
//        };
//
//        for (Animal a:animals ) {
//            a.voice();
//            if(a instanceof Cat){
//                ((Cat)a).findMouse();
//            }
//
//        }

//        someMethod(new Cat("Barsik", "white", 3));

//        SuperCat superCat = new SuperCat("Barsik","white", 3);
//        System.out.println(superCat);

        Cat cat2 = new Cat("Barsik", "white", 3);
        Cat cat3 = new Cat("Barsik", "white", 3);

        System.out.println(cat2.equals(cat3));

    }

    static void someMethod(Animal animal){
        animal.jump();
        animal.voice();
        animal.sleep();
    }
}
