package pl.wroclaw.kmiecik.main;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HelloTest {
	
	@Test
	public void shouldAddNumbers() {
		// given
		int firstArg = 8;
		int secondArg = 2;
		// when
		int sum = Hello.addNumbers(firstArg, secondArg);
		// then
		assertTrue(sum == firstArg + secondArg);
		// cc
	}
	
}
