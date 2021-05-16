package capgemini.SpringAssignment.SpringCoreQ3;

import org.springframework.beans.factory.annotation.Autowired;

public class bankAccountRepositoryImpl implements bankAccountRepository{
	
	@Autowired
	bankAccout b1;

	public double GetBalance(long accountId) {
		return accountId;
	}

	public double updateBalancce(long accountId, double newBalance) {
		return newBalance;
	}
	

}
