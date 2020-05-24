package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameNumberTest {
    @Test
   public void should_return_2_when_report_given_2_is_not_dividable_by_3_5_7() {
        GameNumber gameNumber = new GameNumber(2);
        assertEquals("2", gameNumber.report());
    }


}
