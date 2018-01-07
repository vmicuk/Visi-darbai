package VMicukOOP;

import lt.vtvpmc.oop.practice.Account;
import lt.vtvpmc.oop.practice.FeeCollector;

public class MyAccount implements Account, FeeCollector {

	private double balance;
	private String accountNumber;
	private int transNumber;
	private double transPrice = 0.02;
	private double transBalance;

	public MyAccount(String accountNumber) {
		this.accountNumber = accountNumber;
	}

//	public MyAccount(String number) {
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public boolean deposit(double amount) {
		if (amount >= 5.00) {
			this.balance += (amount - (amount * transPrice));
			transBalance += amount*transPrice;
			transNumber++;
			return true;
		}
		return false;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public String getNumber() {
		return accountNumber;
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount >= 5.0 && this.balance - amount < (this.balance - this.balance*0.1)) {
			this.balance -= amount;
			transNumber++;
			return true;
		}
		return false;
	}

	@Override
	public double getAverageEarningsPerTransaction() {
		return transBalance/transNumber;
	}

	@Override
	public double getEarnings() {
		return transBalance;
	}

	@Override
	public int getNumberOfTransactions() {
		return transNumber;
	}

}
