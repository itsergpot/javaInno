package potapov.sergey.part1.lesson01.task01;

public class NegativeNumberException extends Exception {
    private final int number;
    public int getNumber(){
        return number;
    }
    public NegativeNumberException(String message, int num){

        super(message);
        number=num;
    }
}
