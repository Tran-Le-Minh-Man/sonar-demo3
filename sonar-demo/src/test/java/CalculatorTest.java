import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calculator c= new Calculator();
		assertEquals(15, c.plus(5, 10));
		assertEquals(15,c.minus(20, 5));
	}

}
