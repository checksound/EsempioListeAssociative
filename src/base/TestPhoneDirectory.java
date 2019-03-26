package base;

public class TestPhoneDirectory {

	public static void main(String[] args) {
		
		PhoneDirectory phoneDirectory = new PhoneDirectory();
		
		phoneDirectory.putNumber("Massimo", "223234332");
		phoneDirectory.putNumber("Carlo", "1111111111");
		
		String phoneNumber = phoneDirectory.getNumber("Massimo");
		
		System.out.println("phoneNumber Massimo: " + phoneNumber);
		
		phoneNumber = phoneDirectory.getNumber("Carlo");
		
		System.out.println("phoneNumber Carlo: " + phoneNumber);
		
		phoneNumber = phoneDirectory.getNumber("Gigi");
		
		System.out.println("phoneNumber: " + phoneNumber);
		
		// modifico numero telefono di Massimo
		phoneDirectory.putNumber("Massimo", "44444444");
		
		phoneNumber = phoneDirectory.getNumber("Massimo");
		
		System.out.println("Nuovo phoneNumber Massimo: " + phoneNumber);
	}

}
