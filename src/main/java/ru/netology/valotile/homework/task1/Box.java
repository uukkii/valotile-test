package ru.netology.valotile.homework.task1;

public class Box extends Thread {

    protected static volatile boolean tumbler;
    protected static int count = 1;
    protected static final long DELAY = 1000L;
    protected static final int NUMBER_OF_ITERATION = 10;

    protected static final String USERNAME = "User";
    protected static final String TOYNAME = "Useless box";

    User user = new User(USERNAME);
    Toy toy = new Toy(TOYNAME);

    public void run() {
        user.start();
        toy.start();

        try {
            user.join();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        toy.interrupt();
    }
}
