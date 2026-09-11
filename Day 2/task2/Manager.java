package task2;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        return getSalary() * 1.30;
    }
}
