package VMicukOOP;

import lt.vtvpmc.oop.practice.Account;
import lt.vtvpmc.oop.practice.Bank;

public class MyBank extends Bank {

	@Override
	protected Account postProcessAccount(Account account) {
		// TODO Auto-generated method stub
		return super.postProcessAccount(new MyAccount(account.getNumber()));
	}

}
