package fizzbuzz;

public class GameNumber {
    private int number;

    public GameNumber(int number) {
        this.number = number;
    }

    public String report() {
        if (isDividableBy(3)) {
            return "Fizz";
        }
        if (isDividableBy(5)) {
            return "Buzz";
        }
        if (isDividableBy(7)) {
            return "Whizz";
        }
        return String.valueOf(number);
    }

    private boolean isDividableBy(int i) {
        return number % i == 0;
    }
}
