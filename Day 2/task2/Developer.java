package task2;

public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        return getSalary() * 1.20;
    }
}
