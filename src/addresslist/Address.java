package addresslist;

public class Address {
	
	private String street;
	private int number;
	private String city;
	private int cap;
	private String country;
	
	public Address(String street, int number, String city, int cap, String country) {
		this.street = street;
		this.number = number;
		this.city = city;
		this.cap = cap;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public int getNumber() {
		return number;
	}

	public String getCity() {
		return city;
	}

	public int getCap() {
		return cap;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + ", city=" + city + ", cap=" + cap + ", country="
				+ country + "]";
	}
	
	
}
