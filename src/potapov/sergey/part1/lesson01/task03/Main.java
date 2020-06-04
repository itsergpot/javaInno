package potapov.sergey.part1.lesson01.task03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numOne;
        boolean inputInvalid = true;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите целое положительное число секунд: ");
        do {
            try {
                numOne = keyboard.nextDouble();
                if (numOne < 0) throw new NegativeNumberException("Число не может быть < 0", numOne);
                System.out.println("Количестов часов: " + numOne/3600d);
                inputInvalid = false;
            } catch (Exception e) {
                System.out.println("Введенное число секунд не является целым и положительным или не является числом вовсе. Введите число секунд повторно:");
                keyboard.next();
            }
        } while (inputInvalid);
        keyboard.close();
    }
}
