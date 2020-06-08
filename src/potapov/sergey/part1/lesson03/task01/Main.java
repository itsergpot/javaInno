package potapov.sergey.part1.lesson03.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int GASOLINE_COST = 50;
        int randomIncValue;
        boolean inputInvalid = true;


        System.out.println("Введите целое положительное число: ");
        do {
            try {
                Scanner keyboard = new Scanner(System.in);
                randomIncValue = keyboard.nextInt();
                if (randomIncValue < 0) throw new NegativeNumberException("Число не может быть < 0: " + randomIncValue);
                System.out.println("Общая стоимость: " + randomIncValue * GASOLINE_COST);
                inputInvalid = false;
                keyboard.close();
            } catch (Exception e) {
                System.out.println("Введенное число не является целым и положительным или не является числом вовсе." +
                        " Введите число повторно:");
            }
        } while (inputInvalid);

    }
}

