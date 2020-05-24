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

        if (isDividableBy(7)) {
            result.append("Whizz");
        }
        return result.length() != 0 ? result.toString() : String.valueOf(number);
    }

    private boolean isDividableBy(int i) {
        return number % i == 0;
    }
}
