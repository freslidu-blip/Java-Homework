package task2;

public class Main {
    public static void main(String[] args) {
        Employee developer = new Developer("Иван", 300000);
        Employee manager = new Manager("Анна", 300000);
        Employee designer = new Designer("Олег", 300000);

        System.out.println(developer.getName() + ": " + developer.calculateSalary());
        System.out.println(manager.getName() + ": " + manager.calculateSalary());
        System.out.println(designer.getName() + ": " + designer.calculateSalary());
    }
}
