package com.company;

public class Main {

    public static void main(String[] args)
    {
        Thread t = new Thread(new Liftoff(20));
        Thread t2 = new Thread(new Liftoff(20));

        t.start();
        t2.start();
    }
}
