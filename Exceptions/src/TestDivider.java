import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestDivider {
	
	private IntDivider div = null;
	

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Before
	public void setup() {
		div = new IntDivider();
	}

	@Test
	public void testEmptyArray() {
		thrown.expect(IllegalArgumentException.class);
		div.divide(new String[] {});
	}

	@Test
	public void testSingleNum() {
		thrown.expect(IllegalArgumentException.class);
		div.divide(new String[] { "4" });
	}

	@Test
	public void testNormalDivision()  {
		assertEquals(2, div.divide(new String[] { "6", "3" }));
	}

//	@Test
//	public void testOutputCalculation() throws UnsupportedEncodingException {
//		ByteArrayOutputStream outSpy = new ByteArrayOutputStream();
//		PrintStream ps = new PrintStream(outSpy);
//		System.setOut(ps);
//
//		assertEquals(2, div.divide(new String[] { "15", "5" }));
//		ps.flush();
//		String content = outSpy.toString("UTF-8");
//		assertTrue("Program must print '6/3=2'", content.replaceAll("\\s","").contains("15/5=3"));
//		System.setOut(null);
//	}
	
	@Test
	public void testDivisionByZero() {
		thrown.expect(IllegalArgumentException.class);
		div.divide(new String[] { "6", "0" });
	}

	@Test
	public void testEmptyElements() {
		thrown.expect(IllegalArgumentException.class);
		div.divide(new String[] { "", "" });
		div.divide(new String[] { "6", "" });
		div.divide(new String[] { "", "3" });
	}

	@Test
	public void testThreeElements() {
		thrown.expect(IllegalArgumentException.class);
		div.divide(new String[] { "6", "3", "8" });
	}

	@Test
	public void testNegatives() {
		assertEquals(-2, div.divide(new String[] { "6", "-3" }));
		assertEquals(2, div.divide(new String[] { "-6", "-3" }));
		assertEquals(-2, div.divide(new String[] { "-6", "3" }));
	}

	@Test
	public void testNonNumbers() {
		thrown.expect(IllegalArgumentException.class);
		div.divide(new String[] { "6", "a" });
		div.divide(new String[] { "ab", "3" });
		div.divide(new String[] { "8", "-" });
	}

	@Test
	public void testFloats() {
		thrown.expect(IllegalArgumentException.class);
		div.divide(new String[] { "6.0", "3.0" });
	}

	@Test
	public void testSpaces() {
		assertEquals(2, div.divide(new String[] { " 6", " 3" }));
		assertEquals(3, div.divide(new String[] { " 9", "3 " }));
		assertEquals(7, div.divide(new String[] { "\t 14 ", "\n\r\n2 " }));
	}

	@Test
	public void testNull() {
		thrown.expect(IllegalArgumentException.class);
		div.divide(null);
	}
}
