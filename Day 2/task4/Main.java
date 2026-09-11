package task4;

import task4.bank.model.Account;
import task4.bank.model.CreditAccount;
import task4.bank.model.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1, "Дима", 100000);
        SavingsAccount savings = new SavingsAccount(2, "Анна", 200000, 5);
        CreditAccount credit = new CreditAccount(3, "Олег", 50000, 100000);

        System.out.println(account1);
        System.out.println(savings);
        System.out.println(credit);

        account1.transfer(savings, 20000);

        System.out.println("\nПосле перевода:");
        System.out.println(account1);
        System.out.println(savings);

        savings.addInterest();
        System.out.println("\nПосле начисления процентов:");
        System.out.println(savings);

        Account copy = new Account(account1);
        System.out.println("\nКопия аккаунта:");
        System.out.println(copy);

        System.out.println("\nСравнение equals: " + account1.equals(copy));
    }
}
