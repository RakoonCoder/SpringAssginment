package capgemini.SpringAssignment.SpringCoreQ3;

public class bankAccountRepositoryImpl implements bankAccountRepository{
	
	bankAccout b1= new bankAccout();
	public double GetBalance(long accountId) {
		
		b1.setAccountBalance(100000);
		double balance = b1.getAccountBalance();
		
		return balance;
	}

	public double updateBalancce(long accountId, double newBalance) {
		b1.getAccountBalance()-
		return newBalance;
	}

}
