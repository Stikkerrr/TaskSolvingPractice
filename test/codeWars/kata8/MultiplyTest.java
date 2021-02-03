package codeWars.kata8;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiplyTest {
	
	@Test
	public void multiply() {
		assertThat(Multiply.multiply(3.0, 7.0), is(21.0));
	}
}