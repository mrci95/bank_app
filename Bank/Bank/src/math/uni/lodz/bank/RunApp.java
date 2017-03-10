package math.uni.lodz.bank;

public class RunApp 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Start");
		
		Account janNowak = new Account("Jan Nowak","321321");
		
		Transaction trans = new Check(janNowak);
		trans.doTransaction();
		trans = new Deposit(janNowak);
		trans.doTransaction();

	}

}