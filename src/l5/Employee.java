package l5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee() {
        this.name = "Petrov Petr Petrovich";
        this.position = "Engineer";
        this.email = "1@m.ru";
        this.phone = "89999999999";
        this.salary = 777777;
        this.age = 66;
    }

    public void info() {
        System.out.println("Имя " + name + " должность " + position + " Почта " + email + " Тел. " + phone + " Зарплата " + salary + " Возраст " + age);
    }
}
