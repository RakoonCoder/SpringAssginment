package capgemini.SpringAssignment.SpringCoreQ3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class bankAccountServiceImpl implements bankAccountService{
	@Autowired
	bankAccout b1;
	@Autowired
	bankAccountRepository br;

	public double withdraw(long accountId, double balance) {
		return balance;
	}

	public double deposit(long accountId, double balance) {
		return br.GetBalance(accountId);
	}

	public double getBalance(long accountId) {
		return br.GetBalance(b1.getAccountId());
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		return false;
	}

	

}
