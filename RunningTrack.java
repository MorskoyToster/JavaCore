package ru.geekbrains.java.core.lesson_1.Verhovskii_IA;

public class RunningTrack extends Obstacles {

    @Override
    public boolean examSportsman() {
    if (currentDistance < human1.getMaxRun()) /* а переменную текущей дистанции из мейна и экземпляры участников в препятствиях тоже не видно.. */
        return true;
    }
}
