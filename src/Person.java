
public class Person {
	//creating variables for the person name,surname,phone number email address and physical address
	String Name;
	String Surname;
	String TelephoneNumber;
	String EmailAddress;
	String PhysicalAddress;
	
	public Person(String Name, String Surname, String TelephoneNumber, String EmailAddress,	String PhysicalAddress) {
		//initializing the person information
		this.Name = Name;
		this.Surname = Surname;
		this.TelephoneNumber = TelephoneNumber;
		this.EmailAddress = EmailAddress;
		this.PhysicalAddress =  PhysicalAddress;
	}
	
	public void changeTelephoneNumber (String newTelephoneNumber) {
		//a method to change a customer telephone number to a new user
		this.TelephoneNumber = newTelephoneNumber;
	}
}