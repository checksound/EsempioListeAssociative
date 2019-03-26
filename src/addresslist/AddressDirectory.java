package addresslist;

import java.util.HashMap;
import java.util.Map;

public class AddressDirectory {
	
	private Map<Customer, Address> addressDirectory = new HashMap<>();
	
	public void putAddress(Customer customer, Address address) {
		addressDirectory.put(customer, address);
	}
	
	public Address getAddress(Customer customer) {
		return addressDirectory.get(customer);
	}

	@Override
	public String toString() {
		return "AddressDirectory [addressDirectory=" + addressDirectory + "]";
	}
	
	
	
	

}
