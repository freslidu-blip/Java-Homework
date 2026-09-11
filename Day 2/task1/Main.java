package task1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Дима", 19);
        System.out.println(student);

        student.setAge(20);
        System.out.println("Новый возраст: " + student.getAge());

        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
