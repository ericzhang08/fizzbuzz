package fizzbuzz;

public class GameNumber {
    private int number;

    public GameNumber(int number) {
        this.number = number;
    }

    public String report() {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        if (number % 7 == 0) {
            return "Whizz";
        }
        return String.valueOf(number);
    }
}
