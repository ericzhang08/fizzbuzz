package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameNumberTest {
    @Test
   public void should_return_2_when_report_given_2_is_not_dividable_by_3_5_7() {
        GameNumber gameNumber = new GameNumber(2);
        assertEquals("2", gameNumber.report());
    }

    @Test
    public void should_return_Fizz_when_report_given_3_is_dividable_by_3() {
        GameNumber gameNumber = new GameNumber(3);
        assertEquals("Fizz", gameNumber.report());
    }

    @Test
    public void should_return_Fizz_when_report_given_5_is_dividable_by_5() {
        GameNumber gameNumber = new GameNumber(5);
        assertEquals("Buzz", gameNumber.report());
    }

    @Test
    public void should_return_Fizz_when_report_given_7_is_dividable_by_7() {
        GameNumber gameNumber = new GameNumber(7);
        assertEquals("Whizz", gameNumber.report());
    }





}
