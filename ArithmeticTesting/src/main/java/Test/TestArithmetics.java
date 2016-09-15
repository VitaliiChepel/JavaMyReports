package Test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import ArithmeticOperation.ArithmeticOperations;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TestArithmetics {

	private static ArithmeticOperations a;

	@Rule
	public final ExpectedException exp = ExpectedException.none();

	@Rule
	public Timeout time = Timeout.millis(1000);

	@BeforeClass
	public static void RunT() {
		a = new ArithmeticOperations();
	}

	@Test
	public void testAdd() {
		double res = a.add(3, 7);
		if (res != 10)
			Assert.fail();

	}

	@Test
	public void testDeduct() {
		double res = a.deduct(18, 8);
		Assert.assertEquals(res, 10.0, 0.0);
	}

	@Test
	public void testMult() {
		double res = a.mult(8, 3);
		Assert.assertTrue(res == 24.0);
	}

	@Test
	public void testDiv() {
		double res = a.div(21, 3);
		Assert.assertTrue(res == 7);
	}

	@Ignore
	@Test
	public void testDiv1() {
		ArithmeticOperations a = new ArithmeticOperations();
		double res = a.div(24, 3);
		Assert.assertTrue(res == 8);
	}

	@Test(expected = ArithmeticException.class)
	public void TestDivException() {
		a.div(10.0, 0.0);
	}

	@Test(timeout = 1000)
	public void testN() {
		a.div(10.0, 5.0);
	}

	@Test
	public void TestDivExceptionClass() {
		exp.expect(ArithmeticException.class);
		a.div(10.0, 0.0);
	}
}
