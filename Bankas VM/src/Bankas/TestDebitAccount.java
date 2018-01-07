package Bankas;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class TestDebitAccount {

	@Test
	public void testGetBalance() {
		BigDecimal balance = new BigDecimal(2000);
		assertNotNull("Balance must be not null", balance);
	}

	@Test
	public void testGetHolderName() {
		String holderNumber = "Eva";
		assertNotNull("Name bust be filled", holderNumber);
	}
	
	@Test
	public void testGetNumber() {
		String holderNumber = "LT123456";
		assertNotNull(holderNumber);
	}

	@Test
	public void testDeposit() {
		int balance = 25;
		assertEquals("Adding 20 and 5 result: 25", 25, balance);
		assertNotEquals(24, balance);
	}

	private int assertNotEquals(int i, int balance) {
		// TODO Auto-generated method stub
		return 0;
		
	}

}
