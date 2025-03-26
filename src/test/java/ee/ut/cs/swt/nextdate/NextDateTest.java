package ee.ut.cs.swt.nextdate;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Test;

public class NextDateTest {
	
	private NextDate trialDate = new NextDate(3,4,1976);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	//@Test
	/*
	 * Test method for 'ee.ut.cs.swt.nextdate.NextDate.run(int, int, int)'
	 */
	
	@Test
	public final void testJuneToJuly(){
	assertEquals("7/1/2001", trialDate.run(6, 30, 2001));
	}
	
	@Test
	public final void testMarchToApril(){
	assertEquals("4/1/2001", trialDate.run(3, 31, 2001));
	} 
	
	@Test
	public final void testDecemberToJanuary(){
	assertEquals("1/1/2002", trialDate.run(12,31,2001));
	}
	@Test
	public final void t1(){
		assertEquals("Invalid Input Date", trialDate.run(0,1,12));
	}
	@Test
	public final void t2(){
		assertEquals("1/31/2000", trialDate.run(1, 30, 2000));
	}
	@Test
	public final void t3(){
		assertEquals("2/1/2000", trialDate.run(1,31,2000));
	}

	@Test
	public final void t4(){
		assertEquals("1/1/2011", trialDate.run(12, 31, 2010));
	}
	@Test
	public final void t5(){
		assertEquals("12/16/2010", trialDate.run(12, 15, 2010));
	}

	@Test
	public final void t6(){
		assertEquals("4/21/2000", trialDate.run(4, 20, 2000));
	}
	@Test
	public final void t7(){
		assertEquals("5/1/2000", trialDate.run(4, 30, 2000));
	}
	@Test
	public final void t8(){
		assertEquals("Invalid Input Date", trialDate.run(4, 31, 2000));
	}
	@Test
	public final void t9(){
		assertEquals("2/29/2008", trialDate.run(2, 28, 2008));
	}
	@Test
	public final void t10(){
		assertEquals("Invalid Input Date", trialDate.run(2, 29, 2010));
	}



	@Test
	public final void t11(){
		assertEquals("7/31/2020", trialDate.run(7,30,2020));
	}
	@Test
	public final void t12(){
		assertEquals("12/31/2020", trialDate.run(12, 30,2020));
	}
	@Test
	public final void t13(){
		assertEquals("Invalid Input Date", trialDate.run(12, 32,2021));
	}
	@Test
	public final void t14(){
		assertEquals("Invalid Next Year", trialDate.run(12, 31,2021));
	}
	@Test
	public final void t15(){
		assertEquals("8/1/2021", trialDate.run(7, 31,2021));
	}








}

