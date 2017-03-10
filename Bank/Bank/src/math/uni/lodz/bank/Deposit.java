package math.uni.lodz.bank;

public class Deposit implements Transaction
{
	private Account accountFrom;
	
	public Deposit(Account accountFromIn) 
	{
		accountFrom = accountFromIn;
	}
	
	@Override
	public void deleteTransaction() 
	{
		System.out.println("Deposit.deleteTransaction for Name: " + accountFrom.getName() + ", Number: " + accountFrom.getNumber());
	}
	@Override
	public void doTransaction() 
	{
		System.out.println("Deposit.doTransaction for Name: " + accountFrom.getName() + ", Number: " + accountFrom.getNumber());
	}
	@Override
	public void stopTransaction() 
	{
		System.out.println("Deposit.stopTransaction for Name: " + accountFrom.getName() + ", Number: " + accountFrom.getNumber());
	}

}
