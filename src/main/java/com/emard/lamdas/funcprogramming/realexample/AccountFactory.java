package com.emard.lamdas.funcprogramming.realexample;

public interface AccountFactory {
    public BankAccount getBankAccount(Integer id, Double balance, String accountName);
}
