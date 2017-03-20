import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest extends TestCase {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testReturnsFizzWhenInputIsDivisibleByThree() {
        int[] input = {1, 2, 3, 4};
        String result = fizzBuzz.run(input);
        assertEquals("1 2 Fizz 4", result);
    }

    @Test
    public void testReturnsBuzzWhenInputIsDivisibleByFive() {
        int[] input = {5, 7};
        String result = fizzBuzz.run(input);
        assertEquals("Buzz 7", result);
    }

    @Test
    public void testReturnsFizzBuzzWhenInputIsDivisibleByThreeAndFive() {
        int[] input = {5, 15, 18};
        String result = fizzBuzz.run(input);
        assertEquals("Buzz FizzBuzz Fizz", result);
    }
}
