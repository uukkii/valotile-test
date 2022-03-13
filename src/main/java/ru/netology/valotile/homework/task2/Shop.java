package ru.netology.valotile.homework.task2;

import java.util.stream.IntStream;

import static ru.netology.valotile.homework.task2.Application.stat;

public class Shop extends Thread {
    protected int[] array = IntStream.range(0, 500).toArray();

    public Shop(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i : array) {
            stat.add(i);
        }
    }
}
