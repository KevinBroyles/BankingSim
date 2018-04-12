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
		// Testing if bank.setInsufficientFundsPenalty() changes the insufficient funds penalty 
		
		// Old InsufficientFundsPenalty, in dollars
		double oldFundsPenalty = bank.getInsufficientFundsPenalty();
		// New InsufficientFundsPenalty, in dollars
		double newFundsPenalty = 1.00;
		
		// Setting the insufficient funds penalty to the new value
		bank.setInsufficientFundsPenalty(newFundsPenalty);
		// Setting newFundsPenalty to the new value (if it changed)
		newFundsPenalty = bank.getInsufficientFundsPenalty();

		// Determining if the insufficient funds penalty was changed
		Assert.assertTrue(oldFundsPenalty != newFundsPenalty);
	}

	@Test
	public void testGetNAME() {
		// Testing if the String returned by the getNAME() method is null
		// Also testing if it equals the NAME variable
		String bankName = bank.getNAME();
		Assert.assertNotNull(bankName);
		Assert.assertEquals(bankName, NAME);
	}

	@Test
	public void testAddAccountWizard() {
		// Testing if accounts can be successfully added via the account wizard
		
		// Current accounts sorted set
		SortedSet<Account> accounts = bank.getAllAccounts();
		// Current number of accounts in the accounts sorted set
		int oldNumberOfAccounts = accounts.size();
		// Adding a new account from the customer wizard
		bank.addAccountWizard();
		// New accounts sorted set
		accounts = bank.getAllAccounts();
		// New number of accounts in the accounts sorted set
		int newNumberOfAccounts = accounts.size();
		
		// Determining if the number of accounts in the accounts sorted set was changed
		Assert.assertTrue(newNumberOfAccounts != oldNumberOfAccounts);
	}

	@Test
	public void testGetAllAccounts() {
		// Testing if the bank's sorted set of accounts returns null
		SortedSet<Account> accounts = bank.getAllAccounts();
		Assert.assertNotNull(accounts);
	}

	@Test
	public void testAddCustomerWizard() {
		// Testing if customers can be successfully added via the customer wizard
		
		// Current customers sorted set
		SortedSet<Customer> customers = bank.getAllCustomers();
		// Current number of customers in the customers sorted set
		int oldNumberOfCustomers = customers.size();
		// Adding a new customer from the customer wizard
		bank.addCustomerWizard();
		// New customers sorted set
		customers = bank.getAllCustomers();
		// New number of customers in the customers sorted set
		int newNumberOfCustomers = customers.size();
		
		// Determining if the number of customers in the customers sorted set was changed 
		Assert.assertTrue(oldNumberOfCustomers != newNumberOfCustomers);
	}

	@Test
	public void testAddCustomer() {
		// Testing if customers can be successfully added
		
		// Current customers sorted set
		SortedSet<Customer> customers = bank.getAllCustomers();
		// Current number of customers in the customers sorted set
		int oldNumberOfCustomers = customers.size();
		// Adding a new customer with the name lastName, firstName
		bank.addCustomer("lastName", "firstName");
		// New customers sorted set
		customers = bank.getAllCustomers();
		// New number of customers in the customers sorted set
		int newNumberOfCustomers = customers.size();
		
		// Determining if the number of customers in the customers sorted set was changed 
		Assert.assertTrue(oldNumberOfCustomers != newNumberOfCustomers);
	}

	@Test
	public void testRemoveCustomer() {
		// Testing if customers can be successfully removed
		
		// Current customers sorted set
		SortedSet<Customer> customers = bank.getAllCustomers();
		// Current number of customers in the customers sorted set
		int oldNumberOfCustomers = customers.size();
		// Removing a customer with the ID of 1 from the bank
		bank.removeCustomer("1");
		// New customers sorted set
		customers = bank.getAllCustomers();
		// New number of customers in the customers sorted set
		int newNumberOfCustomers = customers.size();
		
		// Determining if the number of customers in the customers sorted set was changed 
		Assert.assertTrue(oldNumberOfCustomers != newNumberOfCustomers);
	}

	@Test
	public void testGetAllCustomers() {
		// Testing if the bank's sorted set of customers returns null
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
	public void testToString() {
		// Testing if bank.toString() returns the bank's name
		String expected = NAME;
		String actual = bank.toString();
		Assert.assertEquals(expected, actual);
	}
}
