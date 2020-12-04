package ru.geekbrains.java.core.lesson_1.Verhovskii_IA;

public class Robot implements Moves {

    private String name;
    private final float maxRunMetres = 14000;
    private final float maxJumpMetres = 16;
    private float jumps;
    private float runs;

    Robot (String name, float jumps, float runs) {
        this.name = name;
        this.jumps = jumps;
        this.runs = runs;
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
        return this.maxRunMetres;
    }

    float getMaxJump() {
        return this.maxJumpMetres;
    }
}
