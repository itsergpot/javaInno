package potapov.sergey.part1.lesson03.task04;

import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class Main {
    public static void main(String[] args) {

        int previousGuessedNumber = 0;
        int keyboardIncValue;

        //Random value generation for our game
        int startOfRange = 1;
        int endOfRange = 100;
        int randomValueByRandomGenerator = startOfRange + (int) (Math.random() * endOfRange);

        //Control point (check)
        //System.out.println(randomValueByRandomGenerator);

        //user action (attempts to guess the number)
        System.out.println("Сыграем в игру горячо-холодно? Попробуйте угадать загаданное число." +
                " Вы всегда можете покинуть игру, введя слово - exit");
        System.out.println("Введите число в интервале от 1 до 100:");
        while (true){

                Scanner scan = new Scanner(System.in);
                String inputText = scan.nextLine();

                if (inputText.equals("exit")) {
                    System.out.println("Вы вышли из игры!");
                    break;
                }
                try{
                    keyboardIncValue = Integer.parseInt(inputText);
                    if (keyboardIncValue > 0 && keyboardIncValue < 100){

                        if (keyboardIncValue == randomValueByRandomGenerator){
                            System.out.println("Вы угадали загаданное число. Поздавляем!");
                            scan.close();
                            break;
                        } else if (abs(keyboardIncValue - randomValueByRandomGenerator) <
                                abs(previousGuessedNumber - randomValueByRandomGenerator)){
                            System.out.println("Горячо. Ведите новое число:");
                            previousGuessedNumber = keyboardIncValue;
                        } else if (abs(keyboardIncValue - randomValueByRandomGenerator) >
                                abs(previousGuessedNumber - randomValueByRandomGenerator)){
                            System.out.println("Холодно. Введите новое число:");
                            previousGuessedNumber = keyboardIncValue;
                        } else if (keyboardIncValue == previousGuessedNumber){
                            throw new IncorrectNumberException("Wrong data");
                        }
                    } else throw new IncorrectNumberException("Wrong data");

                }
                catch (Exception ex){
                System.out.println("Введенное число не является числом, выходит за диапозон от 1 до 100 " +
                        "или было введено тоже самое число. ");
                }
        }
    }
}
