package com.emard.lamdas.funcprogramming.realexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BankTransfert {
    public static void main(String[] args) {
        AccountFactory factory = BankAccount::new;
        BankAccount studentBankAccount = factory.getBankAccount(1, 50000d, "StudentA");
        BankAccount universityBankAccount = factory.getBankAccount(2, 100000d, "University");

        BiPredicate<Double, Double> p1 = (balance, amount) -> balance > amount;
        BiConsumer<String, Double> printer = (x, y) -> log.info("[{}]", x + y);
        BiConsumer<BankAccount, BankAccount> printer2 = (student, university) -> 
        log.info("Ending balance of student account: [{}] University account [{}]", student.getBalance() + university.getBalance());
        ExecutorService service = Executors.newFixedThreadPool(10);
        Thread t1 = new Thread(() ->{
            log.info("[{}] says :: executing transfer");
            try{
                Double amount = 1000d;
                if(!p1.test(studentBankAccount.getBalance(), amount)){
                    printer.accept(Thread.currentThread().getName()+" says:: balance insufficient", amount);
                    return;
                }
                while (!studentBankAccount.transfer(universityBankAccount, amount)) {
                    TimeUnit.MILLISECONDS.sleep(100);
                    continue;
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            printer.accept(Thread.currentThread().getName()+" says transfert is successful: Balance in account ", universityBankAccount.getBalance());
        });
        
        for (int i = 0; i < 20; i++) {
            service.submit(t1);
        }
        service.shutdown();
        try {
            while (!service.awaitTermination(24l, TimeUnit.HOURS)) {
                log.info("Not yet. Still wait for termination");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printer2.accept(studentBankAccount, universityBankAccount);
    }
}
