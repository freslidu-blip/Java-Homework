package task4.bank.model;

public class CreditAccount extends Account {
    private double creditLimit;

    public CreditAccount(int id, String owner, double balance, double creditLimit) {
        super(id, owner, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0 || balance - amount < -creditLimit) {
            throw new IllegalArgumentException("Превышен кредитный лимит");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "CreditAccount{id=" + getId() +
                ", owner='" + getOwner() + '\'' +
                ", balance=" + getBalance() +
                ", creditLimit=" + creditLimit + "}";
    }
}
