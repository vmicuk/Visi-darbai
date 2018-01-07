package Bankas;

import java.math.BigDecimal;
import java.util.Random;

import ibank.Account;

public class DebitAccount implements Account {


	private BigDecimal balance = BigDecimal.ZERO;
	private String holderName;
	private String holderNumber;
	
	public DebitAccount(String holderName) {
		this.holderName = holderName;
		this.holderNumber = uniqid();
	}
	
	private String uniqid() {
	    Random random = new Random();
	    String uniqueNumber = Long.toString(Math.abs(random.nextLong()), 36);
	    return uniqueNumber.substring(0, 8);
	}

	@Override
	public boolean deposit(BigDecimal amount) {
		if (amount != BigDecimal.ZERO) {
			balance =  balance.add(amount);
			return true;
		}
		return false;
	}

	@Override
	public BigDecimal getBalance() {
		return balance;
	}

	@Override
	public String getHolderName() {
		return holderName;
	}

	@Override
	public String getNumber() {
		return holderNumber;
	}

	@Override
	public boolean withdraw(BigDecimal amount) {
		balance = balance.subtract(amount);
		return true;
	}
	
	
	

}
