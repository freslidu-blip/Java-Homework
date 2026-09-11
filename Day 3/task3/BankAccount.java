package task3;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) throws NegativeBalanceException {
        if (balance < 0) {
            throw new NegativeBalanceException("Начальный баланс не может быть отрицательным");
        }
        this.balance = balance;
    }

    public void withdraw(double amount) throws NegativeBalanceException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма должна быть больше 0");
        }
        if (amount > balance) {
            throw new NegativeBalanceException("Недостаточно средств");
        }
        balance -= amount;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма должна быть больше 0");
        }
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
