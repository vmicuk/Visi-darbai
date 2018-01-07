package VMicukOOP;

import lt.vtvpmc.oop.practice.Account;

public class MyBankAccount implements Account {

	@Override
	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		if (amount > 5.0) return true;
		return false;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
