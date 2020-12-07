package ru.geekbrains.java.core.lesson_2.Verhovskii_IA;

public class Main {

    public static void main(String[] args) {
        Main object = new Main();
        String arr2[][] = {
                {"1", "2", "3"},
                {"1", "2", "3"},
                {"1", "2", "3"},
                {"1", "2", "3"}
        };
        try {
            object.arrayException(arr2);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    public void arrayException(String[][] arr) throws MyArraySizeException {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException(String.format("Неверное количество столбцов в %d-й строке", i));
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4) throw new MyArraySizeException("Неверное количество строк");
                System.out.print(arr[i][j]);
            }
        }
    }

    class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }
}
