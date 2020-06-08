package potapov.sergey.part1.lesson03.task03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double randomIncValue;
        boolean inputInvalid = true;

        System.out.println("Введите целое положительное число секунд: ");
        do {
            try {
                Scanner keyboard = new Scanner(System.in);
                randomIncValue = keyboard.nextDouble();
                if (randomIncValue < 0) throw new NegativeNumberException("Число не может быть < 0: " + randomIncValue);
                System.out.println("Количестов часов: " + randomIncValue/3600);
                inputInvalid = false;
                keyboard.close();
            } catch (Exception e) {
                System.out.println("Введенное число секунд не является целым и положительным или не является числом вовсе." +
                        " Введите число секунд повторно:");
            }
        } while (inputInvalid);
    }
}
