package Bankas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


import ibank.Account;
import ibank.Bank;

public class MyBank implements Bank {
	Collection<Account> myAccount = new HashSet<Account>();

	@Override
	public void closeAccount(Account account) {
		myAccount.remove(account);
	}

	@Override
	public Account getAccountByHolderName(String accountHolderName) {
		for (Account accountByName: myAccount) {
			if (accountByName.getHolderName().equalsIgnoreCase(accountHolderName)) return accountByName;
		}
		return null;
	}

	@Override
	public Account getAccountByNumber(String number) {
		for (Account accountByNumber: myAccount) {
			if (accountByNumber.getNumber().equals(number))
			return accountByNumber;
		}
		return null;
	}

	@Override
	public Collection<Account> getAllAccounts() {
		Collection<Account> getAllAccounts = new ArrayList<>();
		for (Account allAccounts: myAccount){
			getAllAccounts.add(allAccounts);
		}
		return getAllAccounts;
	}

	@Override
	public int getNumberOfAccounts() {
		return myAccount.size();
	}

	@Override
	public BigDecimal getTotalReserves() {
		BigDecimal bankReserves = BigDecimal.ZERO;
		for (Account reserves: myAccount) {
			bankReserves = bankReserves.add(reserves.getBalance());
		}
		return bankReserves;
	}

	@Override
	public Account openCreditAccount(String accountHolderName, BigDecimal creditLimit) {
		
		for (Account accountByName: myAccount) {
			if (accountByName.getHolderName().equalsIgnoreCase(accountHolderName)) return null;
		}
		CreditAccount creditAccount = new CreditAccount(accountHolderName, creditLimit);
		myAccount.add(creditAccount);
		return creditAccount;
	}

	@Override
	public Account openDebitAccount(String accountHolderName)  {
		
		for (Account accountByName: myAccount) {
			if (accountByName.getHolderName().equalsIgnoreCase(accountHolderName)) return null;
		}
		DebitAccount debitAccount = new DebitAccount(accountHolderName);
		myAccount.add(debitAccount);
		return debitAccount;		
	}

}
