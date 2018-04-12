package banking;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Bank FirstBank = new Bank("First Bank");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCustomerNotNull() {
		Customer testCust = new Customer(FirstBank, "Jones", "Sue");
		assertNotNull(testCust);
	}

	@Test(expected=Exception.class)
	public void testCustomerNoBank() {
		Customer testCust = new Customer("Jones", "Sue");
	}

	@Test(expected=Exception.class)
	public void testCustomerNoLastName() {
		Customer testCust = new Customer(FirstBank, , "Sue");
	}

	@Test(expected=Exception.class)
	public void testCustomerFirstName() {
		Customer testCust = new Customer(FirstBank, "Jones");
	}
	
	@Test
	public void testYtdFees() {
		fail("Not yet implemented");
	}

	@Test
	public void testYtdInterest() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddSavingsAccount() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveAccount() {
		fail("Not yet implemented");
	}

}
