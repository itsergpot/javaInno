package potapov.sergey.part1.lesson01.task01;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int GASOLINE_COST = 50;
        int numOne;
        boolean inputInvalid = true;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        do {
            try {
                numOne = keyboard.nextInt();
                if (numOne < 0) throw new NegativeNumberException("Число не может быть < 0", numOne);
                System.out.println("Общая стоимость: " + numOne * GASOLINE_COST);
                inputInvalid = false;
            } catch (Exception e) {
                System.out.println("Введенное число не является целым и положительным или не является числом вовсе. Введите число повторно:");
                keyboard.next();
            }
        } while (inputInvalid);
        keyboard.close();
    }
}

