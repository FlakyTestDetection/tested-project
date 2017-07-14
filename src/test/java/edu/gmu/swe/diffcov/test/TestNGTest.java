package edu.gmu.swe.diffcov.test;

import java.lang.management.ManagementFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTest {

	@Test
	public void testName() throws Exception {
		System.out.println("PID " + ManagementFactory.getRuntimeMXBean().getName());

		Assert.assertEquals(true, true);
	}

	@Test
	public void testName2() throws Exception {
		if (Math.random() > 0.5)
			Assert.assertEquals(true, false);
	}

	@Test
	public void testName3() throws Exception {
		if (Math.random() > 0.5)
			Assert.assertEquals(true, false);
	}

	@Test
	public void testName4() throws Exception {
		if (Math.random() > 0.5)
			Assert.assertEquals(true, false);
	}

	@Test
	public void testName5() throws Exception {
		if (Math.random() > 0.5)
			Assert.assertEquals(true, false);
	}

	@Test
	public void testName6() throws Exception {
		if (Math.random() > 0.5)
			Assert.assertEquals(true, false);
	}
}
