package ru.geekbrains.java.core.lesson_1.Verhovskii_IA;

public class Cat implements Moves {

    private String name;
    private final float maxRunMetres = 500;
    private final float maxJumpMetres = 1.5f;
    private float jumps;
    private float runs;

    Cat (String name, float jumps, float runs) {
        this.name = name;
        this.jumps = jumps;
        this.runs = runs;
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
        return this.maxRunMetres;
    }

    float getMaxJump() {
        return this.maxJumpMetres;
    }
}
