package math.uni.lodz.bank;

public class Transfer implements Transaction
{
	@Override
	public void deleteTransaction() 
	{
		System.out.println("Transfer.deleteTransaction");
	}
	@Override
	public void doTransaction() 
	{
		System.out.println("Transfer.doTransaction");
	}
	@Override
	public void stopTransaction() 
	{
		System.out.println("Transfer.stopTransaction");
	}

}
