package main.java.org.example._2024_03_11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private final Lock lock = new ReentrantLock();
//    private static final Object LOCK = new Object();


    public BankAccount(double balance) {
        lock.lock();
        this.balance = balance;
        lock.unlock();
    }

    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
        } finally {
            lock.unlock();
        }
//        synchronized (LOCK) {

//        }
    }

    public void withdraw(double amount) {
//        synchronized (LOCK) {
            balance -= amount;
//        }
    }
}
