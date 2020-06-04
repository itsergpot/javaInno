package potapov.sergey.part1.lesson01.task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double numOne;
        boolean inputInvalid = true;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите заработную плату: ");
        do{
            try {
                numOne = keyboard.nextDouble();
                if (numOne < 0) throw new NegativeNumberException("Заработная плата не может быть меньше 0", numOne);
                System.out.println("Заработная плата на руки " + numOne * 0.87);
                inputInvalid = false;
            } catch (Exception e) {
                System.out.println("Заработная плата не может быть меньше нуля (или вы ввели не числовое значение). Введите заработную плату: ");
                keyboard.next();
            }
        } while (inputInvalid);
        keyboard.close();
    }
}
