package banking;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TransactionTest {

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
	public void testTransaction() {
		Transaction transaction = new Transaction(null, 0.00, "");
	}

	@Test
	public void testGetId() {
		assertEquals(1, transaction.getId());
	}

	@Test
	public void testGetTimestamp() {
		assertNotNull(transaction.getTimestamp());
	}

	@Test
	public void testGetType() {
		assertEquals(transaction.getType(), null);
	}

	@Test
	public void testGetAmount() {
		assertEquals(0.00, transaction.getAmount());
	}

	@Test
	public void testGetDescription() {
		assertEquals(null, transaction.getDescription());
	}
}
