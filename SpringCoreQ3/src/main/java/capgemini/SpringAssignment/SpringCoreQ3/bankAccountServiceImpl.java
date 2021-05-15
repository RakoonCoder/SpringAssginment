package capgemini.SpringAssignment.SpringCoreQ3;

import org.springframework.stereotype.Component;

@Component
public class bankAccountServiceImpl implements bankAccountService{
	bankAccout b1= new bankAccout();

	public double withdraw(long accountId, double balance) {
		double a = b1.getAccountBalance() - 1000;
		b1.setAccountBalance(a);
		
		return a;
	}

	public double deposit(long accountId, double balance) {
		double b= b1.accountBalance + 1000;
		b1.setAccountBalance(b);
		return b;
	}

	public double getBalance(long accountId) {
		return b1.accountBalance;
		
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
