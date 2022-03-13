package ru.netology.valotile.homework.task1;

import static ru.netology.valotile.homework.task1.Box.tumbler;

public class Toy extends Thread {

    public Toy(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            if (isInterrupted()) return;
            if (tumbler) {
                tumbler = false;
                System.out.println(getName() + " turn off the tumbler.");
            }
        }
    }
}
