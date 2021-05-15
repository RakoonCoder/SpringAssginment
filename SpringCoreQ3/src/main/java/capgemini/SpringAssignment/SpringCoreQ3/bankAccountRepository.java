package capgemini.SpringAssignment.SpringCoreQ3;

public interface bankAccountRepository {
	public double GetBalance(long accountId);
	public double updateBalancce(long accountId, double newBalance);

}
