package math.uni.lodz.bank;

public class Bank 
{
	private String name;
	private String city;
	private String state;
	private String zip;
	private String street;
	private int number;
	
	public Bank(String nameIn, String cityIn, String stateIn, String zipIn, String streetIn, int numberIn) {
		name = nameIn;
		city = cityIn;
		state = stateIn;
		zip = zipIn;
		street = streetIn;
		number = numberIn;
	}
}
