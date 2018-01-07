package Bankas;

import ibank.Bank;
import ibank.BaseBankTest;

public class TestBaseBank extends BaseBankTest {

	@Override
	protected Bank createBank() {
		return new MyBank();
	}

}
