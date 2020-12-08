package ru.geekbrains.java.core.lesson_1.Verhovskii_IA;

public class Robot implements Moves {

    private String name;
    private final int maxRunDistance = 14000;
    private final float maxJumpHeight = 16;

    Robot (String name) {
        this.name = name;
    }

    @Override
    public void startJumping() {
        System.out.println("Робот прыгает");
    }

    @Override
    public void stopJumping() {
        System.out.println("Результат: ");
    }

    @Override
    public void startRunning() {
        System.out.println("Робот бежит");
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
