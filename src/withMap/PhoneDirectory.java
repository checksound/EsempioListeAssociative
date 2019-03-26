package withMap;

import java.util.HashMap;
import java.util.Map;

/**
 * A PhoneDirectory holds a list of names with a phone number for each name. It
 * is possible to find the number associated with a given name, and to specify
 * the phone number for a given name.
 */
public class PhoneDirectory {

	private Map<String, String> data; // Array that holds the name/number pairs.
	
	/**
	 * Constructor creates an initially empty directory.
	 */
	public PhoneDirectory() {
		data = new HashMap<>();
	}

	/**
	 * Finds the phone number, if any, for a given name.
	 * 
	 * @return The phone number associated with the name; if the name does not occur
	 *         in the phone directory, then the return value is null.
	 */
	public String getNumber(String name) {
		return data.get(name);
	}

	/**
	 * Associates a given name with a given phone number. If the name already exists
	 * in the phone directory, then the new number replaces the old one. Otherwise,
	 * a new name/number pair is added. The name and number should both be non-null.
	 * An IllegalArgumentException is thrown if this is not the case.
	 */
	public void putNumber(String name, String number) {
		if (name == null || number == null)
			throw new IllegalArgumentException("name and number cannot be null");
		
		data.put(name, number);
		
	}
} // end class PhoneDirectory

