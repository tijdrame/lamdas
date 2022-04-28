package com.emard.lamdas.funcprogramming.realexample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@RequiredArgsConstructor
@Slf4j
public class BankAccount {
    @NonNull
    private Integer id; 
    @NonNull
    private Double balance;
    @NonNull
    private String accountName;
    final Lock lock = new ReentrantLock();
    BiFunction<Double, Double, Double> substractFunction = (a, b) -> a - b;
    BiFunction<Double, Double, Double> addFunction = (a, b) -> a + b;
    public Boolean withdraw (double amount) throws InterruptedException{
        if(this.lock.tryLock()){
            Thread.sleep(100);
            balance = substractFunction.apply(balance, amount);
            this.lock.unlock();
            return true;
        }
        return false;
    }

    public Boolean deposit (double amount) throws InterruptedException{
        if(this.lock.tryLock()){
            Thread.sleep(100);
            balance = addFunction.apply(balance, amount);
            this.lock.unlock();
            return true;
        }
        return false;
    }

    public Boolean transfer (BankAccount to, Double amount) throws InterruptedException{
        if(withdraw(amount)){
            log.info("Withdrawing amount: [{}] from: [{}]", amount, getAccountName());
            if(to.deposit(amount)){
                log.info("Depositing amount: [{}] to: [{}]", amount, getAccountName());
                return true;
            }else {
                log.info("Failed to acquire both locks: refundig [{}] to [{}]", amount, accountName);
                while (!deposit(amount)) {
                    continue;
                }
            }
        }
        return false;
    }
}
