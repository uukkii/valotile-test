package ru.netology.valotile.homework.task2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.LongAdder;

public class Application {

    private static final List<String> SHOPS = Arrays.asList("Shop #1", "Shop #2", "Shop #3");
    protected static LongAdder stat = new LongAdder();
    private static final long DELAY = 1000L;

    public static void main(String[] args) {
        for (String name : SHOPS) {
            new Shop(name).start();
        }
        waitForCount();
        showResult();
    }

    private static void waitForCount() {
        try {
            Thread.sleep(DELAY);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    private static void showResult() {
        System.out.printf("\nTotal amount: %d", stat.sum());
    }
}
