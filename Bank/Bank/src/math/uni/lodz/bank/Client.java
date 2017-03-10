package math.uni.lodz.bank;

public class Client 
{
	private String firstName;
	private String secondName;
	private String city;
	private String street;
	private String zip;
	private String state;
	private int number;
	
	public Client(String firstNameIn, String secondNameIn, String cityIn, String streetIn, String zipIn,String stateIn, int numberIn) {
		firstName = firstNameIn;
		secondName = secondNameIn;
		city = cityIn;
		street = streetIn;
		zip = zipIn;
		state = stateIn;
		number = numberIn;
	}
}
