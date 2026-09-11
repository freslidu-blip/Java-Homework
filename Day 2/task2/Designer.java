package task2;

public class Designer extends Employee {
    public Designer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        return getSalary() * 1.15;
    }
}
