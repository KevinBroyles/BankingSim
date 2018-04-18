package banking;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SavingsAccountTest {
	private static Customer cust;
	private final static String NAME = "Billy";
	private Bank bank;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		/// Create Customer test fixture
		cust = new Customer(bank, NAME, "Smith");
	}

	@After
	public void tearDown() throws Exception {
		/// Get rid of test fixture
		cust = null;
	}

	@Test
	public void testDeposit() {
		fail("Not yet implemented");
	}

	@Test
	public void testWithdraw() {
		fail("Not yet implemented");
	}

	@Test
	public void testSavingsAccountCustomerDoubleString() {
		/// Create customer object
		String custName = cust.getFirstName();
		/// Test value is not null
		Assert.assertNotNull(custName);
		
		/// Create initial balance
		Double initialBalance = 1000.00;
		/// Test value is not null
		Assert.assertNotNull(initialBalance);
		
		/// Create account description
		String description = "401k";
		/// Test value is not null
		Assert.assertNotNull(description);
	}

	@Test
	public void testSavingsAccountCustomerDoubleStringDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddInterestTransaction() {
		/// Create rate and test if null
		Double rate = 2.00;
		Assert.assertNotNull(rate);
	}

	@Test
	public void testGetDefaultInterestRate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDefaultInterestRate() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testAccount() {
		fail("Not yet implemented");
	}

	@Test
	public void testTransfer() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAccountDescription() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAccountDescription() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBalance() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTransactions() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTransaction() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAccountId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAccountCreationDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testCompareTo() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
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
	public void testEqualsObject1() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString1() {
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

