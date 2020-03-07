package lesson6.animals;

public class Cat extends Animal {
    int liveCount;

    public Cat(String name, String color, int age) {
        super(name, color, age);
//        System.out.println("constructor Cat ");
    }

    public Cat(String name, String color, int age, int liveCount) {
        super(name, color, age);
        this.liveCount = liveCount;
    }

    public void printName() {
        System.out.println(name);
    }

    @Override
    public void voice() {
        System.out.println(name + ": meow!!!");
    }

    public void findMouse(){
        System.out.println(name+ " ищет мышь");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "liveCount=" + liveCount +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return liveCount == cat.liveCount
                && name.equals(cat.name)
                && color.equals(cat.color)
                && age == cat.age;
    }

    @Override
    public int hashCode() {
        return liveCount
                + 31* name.hashCode()
                + 31* color.hashCode()
                + 31* age;
    }
}
