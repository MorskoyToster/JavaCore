package ru.geekbrains.java.core.lesson_1.Verhovskii_IA;

public class Main implements Obstacles {

    @Override
    public void toRunMetres() {
        float lenght = 2000;
    }

    @Override
    public void toJumpMetres() {
        float height = 1.2f;
    }

    public static void main(String[] args) {

        Human human1 = new Human("Иван", 4, 3000);
        Cat cat1 = new Cat("Пеп", 1, 300);
        Robot robot1 = new Robot("Vally M1-25", 12, 15000);
        float lenght = 2000;
        float height = 1.2f;

        Moves[] olympicGames = {human1, cat1, robot1};

        for (Moves olympicMembers : olympicGames) {
            olympicMembers.startJumping();
            olympicMembers.stopJumping();
            olympicMembers.startRunning();
            olympicMembers.stopRunning();
        }

        Obstacles[] obstacles = {lenght, height};

        for (Obstacles b : obstacles) {

        }
        for (i = 0; i < olympicGames.length; i++) {
            /* String eventName = System.out.println("jump max m. Tries to jump ", olympicGames[i].getMaxJump());

            String eventResult = (olympicGames[i].jump(toJumpMetres)) ? "succeed" : "fails";
            System.out.println(nameString + eventName + toJumpMetres + "m and " + eventResult);

            eventName = String.format("run max %.2fm. Tries to run ", olympicGames[i].getMaxRun());
            eventResult = olympicGames[i].run(toRunMetres) ? "succeed" : "fails";
            System.out.println(nameString + eventName + toRunMetres + "m and " + eventResult); */
        }
    }
}
