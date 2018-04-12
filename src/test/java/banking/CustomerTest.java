package banking;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerTest {
	
	private Bank FirstBank;
	
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
		Customer testCust = FirstBank.getCustomer("12345");
		assertFalse("Fees is less than 0!", 0 > testCust.ytdFees());
	}

	@Test
	public void testYtdInterest() {
		Customer testCust = FirstBank.getCustomer("12345");
		assertFalse("Fees is less than 0!", 0 > testCust.ytdInterest());
	}

	@Test
	public void testAddSavingsAccountNullReturnValue() {
		Customer testCust = FirstBank.getCustomer("12345");
		SavingsAccount newAcc = testCust.addSavingsAccount(-500, "New Standard Savings Account");
		assertNotNull("Account Not Create", newAcc);
	}
	
	@Test
	public void testAddSavingsAccount() {
		Customer testCust = FirstBank.getCustomer("12345");
		int numBefore = testCust.getCustomerAccounts().size();
		testCust.addSavingsAccount(500, "New Standard Savings Account");
		int numAfter = testCust.getCustomerAccounts().size();
		assertFalse("Customer Account Not added", numBefore >= numAfter);
	}

	@Test(expected=Exception.class)
	public void testAddSavingsAccountNegativeBalance() {
		Customer testCust = FirstBank.getCustomer("12345");
		int numBefore = testCust.getCustomerAccounts().size();
		// a new account should not start overdrawn
		testCust.addSavingsAccount(-500, "New Standard Savings Account");
		int numAfter = testCust.getCustomerAccounts().size();
		assertFalse("Customer Account Not added", numBefore >= numAfter);
	}

	@Test
	public void testRemoveAccountZeroLenString() {
		Customer testCust = FirstBank.getCustomer("12345");
		int numBefore = testCust.getCustomerAccounts().size();
		// Account ID should not be 0 length
		testCust.removeAccount("");
		int numAfter = testCust.getCustomerAccounts().size();
		assertFalse("Customer Account Removed", numBefore > numAfter);
	}

	@Test
	public void testRemoveAccount() {
		Customer testCust = FirstBank.getCustomer("12345");
		int numBefore = testCust.getCustomerAccounts().size();
		testCust.removeAccount("");
		int numAfter = testCust.getCustomerAccounts().size();
		assertFalse("Customer Not Account Removed", numBefore <= numAfter);
	}
}
