package task4.bank.service;

import task4.bank.model.Account;

public interface Transferable {
    void transfer(Account to, double amount);
}
