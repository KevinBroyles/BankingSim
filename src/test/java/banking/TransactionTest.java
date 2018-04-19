package banking;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TransactionTest {
	
	//declare the transaction variable for all of the methods
	private static Transaction transaction;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		//creates the transaction information
		 transaction = new Transaction(null, 0.00, "");
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testTransaction() {
		//tests the transaction method
		Transaction transaction = new Transaction(null, 0.00, "");
	}

	@Test
	public void testGetId() {
		//checks to see if the getId method works properly
		assertEquals(transaction.getId(), 1);
	}

	@Test
	public void testGetTimestamp() {
		//tests to make sure the timestamp is not null
		assertNotNull(transaction.getTimestamp());
	}

	@Test
	public void testGetType() {
		//checks to see if the getType method works properly
		assertEquals(transaction.getType(), null);
	}

	@Test
	public void testGetAmount() {
		//checks to see if the getAmount returns the proper value
		assertEquals(transaction.getAmount(), 0.00);
	}

	@Test
	public void testGetDescription() {
		//checks to see if the getDescription displays the description of the transaction
		assertEquals(null, transaction.getDescription());
	}
}
