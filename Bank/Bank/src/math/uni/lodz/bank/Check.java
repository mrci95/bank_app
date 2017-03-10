package math.uni.lodz.bank;

public class Check implements Transaction
{
	private Account accountTo;
	
	public Check(Account accountToIn) 
	{
		accountTo = accountToIn;
	}
	
	@Override
	public void deleteTransaction() 
	{
		System.out.println("Check.deleteTransaction for Name: " + accountTo.getName() + ", Number: " + accountTo.getNumber());
	}
	@Override
	public void doTransaction() 
	{
		System.out.println("Check.doTransaction for Name: " + accountTo.getName() + ", Number: " + accountTo.getNumber());
	}
	@Override
	public void stopTransaction() 
	{
		System.out.println("Check.stopTransaction for Name: " + accountTo.getName() + ", Number: " + accountTo.getNumber());
	}

}
