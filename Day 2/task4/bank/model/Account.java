package task4.bank.model;

import task4.bank.service.Transferable;

public class Account implements Transferable {
    private final int id;
    private String owner;
    protected double balance;

    public Account(int id, String owner, double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    // Конструктор копии
    public Account(Account other) {
        this.id = other.id;
        this.owner = other.owner;
        this.balance = other.balance;
    }

    public int getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма должна быть больше 0");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Недостаточно средств");
        }
        balance -= amount;
    }

    @Override
    public void transfer(Account to, double amount) {
        withdraw(amount);
        to.deposit(amount);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Account)) return false;

        Account other = (Account) obj;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Account{id=" + id +
                ", owner='" + owner + '\'' +
                ", balance=" + balance + "}";
    }
}
