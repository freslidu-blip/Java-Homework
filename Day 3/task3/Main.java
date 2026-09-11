package task3;

public class Main {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(1000);
            System.out.println("Баланс: " + account.getBalance());

            account.withdraw(500);
            System.out.println("После снятия: " + account.getBalance());

            account.withdraw(1000);
        } catch (NegativeBalanceException e) {
            System.out.println("Ошибка банка: " + e.getMessage());
        }
    }
}
