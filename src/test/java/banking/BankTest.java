package banking;

import static org.junit.Assert.*;

import java.util.List;
import java.util.SortedSet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
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
		// Creating the bank test fixture
		bank = new Bank(NAME);
	}

	@After
	public void tearDown() throws Exception {
		// Getting rid of the bank test fixture after it's done being used
		bank = null;
	}

	@Test
	public void testBank() {
		// Testing if the bank test fixture is null
		Assert.assertNotNull(bank);
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInsufficientFundsPenalty() {
		// Testing if the double value returned is null
		double penalty = bank.getInsufficientFundsPenalty();
		Assert.assertNotNull(penalty);
	}

	@Test
	public void testSetInsufficientFundsPenalty() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNAME() {
		// Testing if the String returned by the getNAME() method is null and also testing if it equals the NAME variable
		String bankName = bank.getNAME();
		Assert.assertNotNull(bankName);
		Assert.assertEquals(bankName, NAME);
	}

	@Test
	public void testAddAccountWizard() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllAccounts() {
		// Testing if the sorted set of all customers of all accounts of this bank is null
		SortedSet<Account> accounts = bank.getAllAccounts();
		Assert.assertNotNull(accounts);
	}

	@Test
	public void testAddCustomerWizard() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddCustomer() {
		// Testing if a new customer was added successfully
		String customer = bank.addCustomer("lastName", "firstName");
		Assert.assertNotNull(customer);
	}

	@Test
	public void testRemoveCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllCustomers() {
		// Testing if the sorted set of all current customers is null
		SortedSet<Customer> customers = bank.getAllCustomers();
		Assert.assertNotNull(customers);
		
	}

	@Test
	public void testGetCustomerString() {
		// Testing if the customer with the ID of 1 is not null
		Customer customer = bank.getCustomer("1");
		Assert.assertNotNull(customer);
	}

	@Test
	public void testGetCustomerStringString() {
		// Testing if null is returned instead of a List<Customer> when trying to get a customer named lastName, firstName
		List<Customer> customerList = bank.getCustomer("lastName", "firstName");
		Assert.assertNotNull(customerList);
	}

	@Test
	public void testGetCustomersAccounts() {
		// Testing if null is returned instead of a List<Account> when trying to get the accounts owned by a customer with the ID of 1
		List<Account> customerAccounts = bank.getCustomersAccounts("1");
		Assert.assertNotNull(customerAccounts);
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
