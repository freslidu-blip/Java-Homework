package task4.bank.model;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int id, String owner, double balance, double interestRate) {
        super(id, owner, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        balance += balance * interestRate / 100;
    }

    @Override
    public String toString() {
        return "SavingsAccount{id=" + getId() +
                ", owner='" + getOwner() + '\'' +
                ", balance=" + getBalance() +
                ", interestRate=" + interestRate + "%}";
    }
}
