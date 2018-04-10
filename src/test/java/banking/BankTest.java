package banking;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankTest {
	private static Bank bank;
    private final static String NAME = "TestBank";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		bank = new Bank(NAME);
	}

	@After
	public void tearDown() throws Exception {
		bank = null;
	}

	@Test
	public void testBank() {
		fail("Not yet implemented");
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInsufficientFundsPenalty() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetInsufficientFundsPenalty() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNAME() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddAccountWizard() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllAccounts() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddCustomerWizard() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllCustomers() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomersAccounts() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}

}
