package testPackage;
import myPackage.Lab1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testPMT() {
		assertEquals("This should pass", 7874.91, Lab1.PMT(5,5555,.07),2);
		assertEquals("This should pass", 1104.94, Lab1.PMT(2,1000,.05),2);
		assertNotEquals("This should pass", 2000, Lab1.PMT(10,1000,.4),2);
	}
}
