package main.java.org.example._2024_03_06;

import com.github.javafaker.Faker;

import java.util.concurrent.CountDownLatch;

public class CDLE {
    private static final CountDownLatch COUNT_DOWN_LATCH = new CountDownLatch(3);
    private static final Faker FAKER = new Faker();
    public static void main(String[] args) throws InterruptedException {
        new User(FAKER.funnyName().name(), COUNT_DOWN_LATCH);
        new User(FAKER.funnyName().name(), COUNT_DOWN_LATCH);
        new User(FAKER.funnyName().name(), COUNT_DOWN_LATCH);
        new User(FAKER.funnyName().name(), COUNT_DOWN_LATCH);
        new User(FAKER.funnyName().name(), COUNT_DOWN_LATCH);

        setUp1();
        setUp2();
        setUp3();
    }

    private static void setUp1() throws InterruptedException {
        Thread.sleep(1111);
        System.out.println("Level_1 ia preparing... ... .. .   .     .");
        Thread.sleep(1111);
        COUNT_DOWN_LATCH.countDown();
        System.out.println("Level_1 was done. CDL: " + COUNT_DOWN_LATCH.getCount());
    }

    private static void setUp2() throws InterruptedException {
        Thread.sleep(1111);
        System.out.println("Level_2 ia preparing... ... .. .   .     .");
        Thread.sleep(1111);
        COUNT_DOWN_LATCH.countDown();
        System.out.println("Level_2 was done. CDL: " + COUNT_DOWN_LATCH.getCount());
    }

    private static void setUp3() throws InterruptedException {
        Thread.sleep(1111);
        System.out.println("Level_3 ia preparing... ... .. .   .     .");
        Thread.sleep(1111);
        COUNT_DOWN_LATCH.countDown();
        System.out.println("Level_3 was done. CDL: " + COUNT_DOWN_LATCH.getCount());
    }
}

class User extends Thread {
    private String name;
    private CountDownLatch countDownLatch;

    public User(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            Thread.sleep(888);
            System.out.println("***USER: " + name + " START TO WORK***");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}