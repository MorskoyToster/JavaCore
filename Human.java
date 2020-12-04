package ru.geekbrains.java.core.lesson_1.Verhovskii_IA;

public class Human implements Moves{

    private String name;
    private final float maxRunMetres = 4000;
    private final float maxJumpMetres = 6;
    private float jumps;
    private float runs;

    Human (String name, float jumps, float runs) {
        this.name = name;
        this.jumps = jumps;
        this.runs = runs;
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
        return this.maxRunMetres;
    }

    float getMaxJump() {
        return this.maxJumpMetres;
    }
}
