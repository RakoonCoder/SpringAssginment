package capgemini.SpringAssignment.SpringCoreQ3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class bankAccountController {
	public double withdraw(long accountId , double balance){
		return balance;
		
	}
	public double deposit(long accountId , double balance){
		return balance;
		
	}
	public double getBalance(long accountId){
		return accountId;
		
	}
	
	public double fundTransfer(long fromAccount, long toAccount, double amount){
		return amount;
		
	}
	@Autowired
	bankAccout b1;
	public bankAccout accountDetails(){
		b1.setAccountId(10101);
		b1.setAccountHolderName("Anu");
		b1.setAccountBalance(100000);
		return b1;
		
	}

}
