package ee.ut.cs.swt.nextdate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MTv1 {


    @Test(timeout = 4000)
    public void testCreatesNextDate1() throws Throwable {
        NextDate nextDate0 = new NextDate(6, 30, 2001);
        String string0 = nextDate0.run(6, 30, 2001);
        assertEquals("7/1/2001", string0);
    }

    @Test(timeout = 4000)
    public void testCreatesNextDate2() throws Throwable {
        NextDate nextDate0 = new NextDate(3, 31, 2001);
        String string0 = nextDate0.run(3, 31, 2001);
        assertEquals("4/1/2001", string0);
    }

    @Test(timeout = 4000)
    public void testCreatesNextDate3() throws Throwable {
        NextDate nextDate0 = new NextDate(12, 31, 2021);
        String string0 = nextDate0.run(12, 31, 2021);
        assertEquals("Invalid Next Year", string0);
    }

    @Test(timeout = 4000)
    public void testCreatesNextDate4() throws Throwable {
        NextDate nextDate0 = new NextDate(2, 28, 2004);
        String string0 = nextDate0.run(2, 28, 2004);
        assertEquals("2/29/2004", string0);
    }

}
