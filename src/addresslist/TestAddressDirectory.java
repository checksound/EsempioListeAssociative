package addresslist;

public class TestAddressDirectory {

	public static void main(String[] args) {
		
		AddressDirectory addrDir = new AddressDirectory();
		
		addrDir.putAddress(new Customer("Pippo", "Baudo"), 
				new Address("via Larga", 7, "Roma", 21030, "Italy"));
		
		addrDir.putAddress(new Customer("Jerry", "Scotti"), 
				new Address("via dei Mercanti", 4, "Milano", 21070, "Italy"));
	    
		addrDir.putAddress(new Customer("Quentin", "Tarantino"), 
				new Address("via Real", 33, "Hollywood", 21110, "USA"));
		
		System.out.println(addrDir);
		
		Address address1 = addrDir.getAddress(new Customer("Jerry", "Scotti"));
		
		System.out.println(address1);

	}

}
