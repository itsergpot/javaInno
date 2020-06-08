package potapov.sergey.part1.lesson03.task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double randomIncValue;
        boolean inputInvalid = true;


        System.out.println("Введите заработную плату: ");
        do{
            try {
                Scanner keyboard = new Scanner(System.in);
                randomIncValue = keyboard.nextDouble();
                if (randomIncValue < 0) throw new NegativeNumberException("Заработная плата не может быть меньше 0: " + randomIncValue);
                System.out.println("Заработная плата на руки " + randomIncValue * 0.87);
                inputInvalid = false;
                keyboard.close();
            } catch (Exception e) {
                System.out.println("Заработная плата не может быть меньше нуля (или вы ввели не числовое значение)." +
                        " Введите заработную плату: ");
            }
        } while (inputInvalid);

    }
}
