package Bankas;

import java.math.BigDecimal;
import java.util.Random;

import ibank.Account;

public class CreditAccount implements Account {

	private BigDecimal balance = BigDecimal.ZERO;
	private BigDecimal creditLimit;
	private String holderName;
	private String holderNumber;
			
	public CreditAccount(String holderName, BigDecimal creditLimit) {
		this.holderName = holderName;
		this.creditLimit = creditLimit;
		this.holderNumber = uniqid();
	}

	private String uniqid() {
	    Random random = new Random();
	    String uniqueNumber = Long.toString(Math.abs(random.nextLong()), 36);
	    return uniqueNumber.substring(0, 8);
	}
	
	@Override
	public boolean deposit(BigDecimal amount) {
		balance = balance.add(amount);
		return true;
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
		if (balance.compareTo(BigDecimal.ZERO) > 0) {
			balance = balance.subtract(amount);
			if (balance.compareTo(BigDecimal.ZERO) < 0) {
				creditLimit = creditLimit.add(balance);
				return true;
			}
			return true;
		}
		else if (creditLimit.compareTo(amount) >= 0) {
			creditLimit = creditLimit.subtract(amount);
			return true;	
		}
		return false;
		
	}


	
	
}
