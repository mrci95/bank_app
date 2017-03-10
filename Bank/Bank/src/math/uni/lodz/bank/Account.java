package math.uni.lodz.bank;

public class Account 
{
	private String name;
	private String number;
	
	public Account() 
	{
		this("undefined", "undefinde");
	}
	
	public Account(String nameIn, String numberIn) 
	{
		name = nameIn;
		number = numberIn;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getNumber()
	{
		return number;
	}
}
