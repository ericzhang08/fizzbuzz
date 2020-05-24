package fizzbuzz;

public class GameNumber {
    private int number;

    public GameNumber(int number) {
        this.number = number;
    }

    public String report() {
        StringBuilder result = new StringBuilder();
        if (isDividableBy(3)) {
            result.append("Fizz");
        }
        if (isDividableBy(5)) {
            result.append("Buzz");
        }
        if (result.length() != 0) {
            return result.toString();
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
