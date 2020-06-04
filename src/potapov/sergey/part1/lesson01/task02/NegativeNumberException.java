package potapov.sergey.part1.lesson01.task02;

public class NegativeNumberException extends Exception {
    private final double number;
    public double getNumber(){
        return number;
    }
    public NegativeNumberException(String message, double num){

        super(message);
        number=num;
    }
}
