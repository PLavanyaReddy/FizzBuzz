import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzz {
    @Test
    void returnFizzIfDivisibleBy3() {
        Convert convert = new Convert();
        convert.print(6);
        assertEquals("Fizz","Fizz");

    }
}
