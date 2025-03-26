package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv1 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate((-382), (-382), (-382));
	    String string0 = nextDate0.run(1, 2, 1847);
	    assertEquals("1/3/1847", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 1813, 8);
	    String string0 = nextDate0.run(8, 1813, 1813);
	    assertEquals("9/1/1813", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 1806, 2);
	    String string0 = nextDate0.run(2, 1806, 1806);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(530, 530, 530);
	    String string0 = nextDate0.run(2, 29, 1944);
	    assertEquals("3/1/1944", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(1872, 1872, 1872);
	    String string0 = nextDate0.run(2, 28, 1872);
	    assertEquals("2/29/1872", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(1877, 1877, 1877);
	    String string0 = nextDate0.run(2, 28, 1877);
	    assertEquals("3/1/1877", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 1801, 9);
	    String string0 = nextDate0.run((-3437), 1801, 5);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 1801, 9);
	    String string0 = nextDate0.run(5, 1801, 1801);
	    assertEquals("6/1/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 1801, 12);
	    String string0 = nextDate0.run(11, 5, 1801);
	    assertEquals("11/6/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate((-382), (-382), (-382));
	    String string0 = nextDate0.run(5, 26, 2032);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 1835, 3);
	    String string0 = nextDate0.run(3, 3, 1835);
	    assertEquals("3/4/1835", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate18() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 1801, 9);
	    String string0 = nextDate0.run(1801, 222, 442);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 1801, 12);
	    String string0 = nextDate0.run(12, 1862, 12);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate19() throws Throwable {
	    NextDate nextDate0 = new NextDate(1866, 1866, 1866);
	    String string0 = nextDate0.run(2, 29, 1866);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(7, 1857, 7);
	    String string0 = nextDate0.run(7, 7, 1857);
	    assertEquals("7/7/1857", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 1808, 2);
	    String string0 = nextDate0.run(2, 2, 1808);
	    assertEquals("2/3/1808", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 31);
	    String string0 = nextDate0.run(12, 1821, 1915);
	    assertEquals("1/1/1916", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 1952, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 1801, 12);
	    String string0 = nextDate0.run(12, 12, 1801);
	    assertEquals("12/13/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 1801, 9);
	    String string0 = nextDate0.run(9, 30, 1801);
	    assertEquals("10/1/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(1834, 1834, 1834);
	    String string0 = nextDate0.run(6, 1834, 1834);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 31);
	    String string0 = nextDate0.run(12, 31, 1915);
	    assertEquals("12/32/1915", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 31);
	    String string0 = nextDate0.run(12, 31, 1915);
	    assertEquals("12/32/1915", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(3316, 3316, 3316);
	    String string0 = nextDate0.run((-2261), (-2261), (-1));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 1821, 1821);
	    String string0 = nextDate0.run(4, 4, 1821);
	    assertEquals("4/5/1821", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 1801, 9);
	    String string0 = nextDate0.run(1, 31, 1943);
	    assertEquals("2/1/1943", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 1801, 10);
	    String string0 = nextDate0.run(10, 10, 1801);
	    assertEquals("10/11/1801", string0);
	}

}