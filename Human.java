package ru.geekbrains.java.core.lesson_1.Verhovskii_IA;

public class Human implements Moves{

    private String name;
    private final float maxRunDistance = 4000;
    private final float maxJumpHeight = 6;

    Human (String name) {
        this.name = name;
    }

    @Override
    public void startJumping() {
        System.out.println("Человек прыгает");
    }

    @Override
    public void stopJumping() {
        System.out.println("Результат: ");
    }

    @Override
    public void startRunning() {
        System.out.println("Человек бежит");
    }

    @Override
    public void stopRunning() {
        System.out.println("Результат: ");
    }
    float getMaxRun() {
        return this.maxRunDistance;
    }

    float getMaxJump() {
        return this.maxJumpHeight;
    }
}
