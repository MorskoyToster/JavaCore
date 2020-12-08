package ru.geekbrains.java.core.lesson_1.Verhovskii_IA;

public class Cat implements Moves {

    private String name;
    private final float maxRunDistance = 500;
    private final float maxJumpHeight = 1.5f;

    Cat (String name) {
        this.name = name;
    }

    @Override
    public void startJumping() {
        System.out.println("Кот прыгает");
    }

    @Override
    public void stopJumping() {
        System.out.println("Результат: ");
    }

    @Override
    public void startRunning() {
        System.out.println("Кот бежит расстояние");
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
