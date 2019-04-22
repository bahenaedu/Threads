package com.company;

public class Liftoff implements Runnable{
    private int countdown;
    private static int taskCount = 0;
    private final int id = taskCount++;

    Liftoff(int countdown)
    {
        this.countdown = countdown;
    }

    public String status()
    {
        return id + ": " + (countdown > 0 ? countdown : "Liftoff");
    }

    public void countDown()
    {
        while (countdown-- > 0)
        {
            System.out.println(status());
            Thread.yield();
        }
    }

    @Override
    public void run() {
        countDown();
    }
}
