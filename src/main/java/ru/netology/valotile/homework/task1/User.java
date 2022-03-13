package ru.netology.valotile.homework.task1;

import static ru.netology.valotile.homework.task1.Box.NUMBER_OF_ITERATION;
import static ru.netology.valotile.homework.task1.Box.DELAY;
import static ru.netology.valotile.homework.task1.Box.tumbler;
import static ru.netology.valotile.homework.task1.Box.count;

public class User extends Thread {

    public User(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < NUMBER_OF_ITERATION; i++) {
            tumbler = true;
            System.out.println(getName() + " turn on the tumbler " + count + " times.");
            count++;
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
