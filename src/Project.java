
public class Project {
	//creating variables for my project
	int ProjectNumber;
	String ProjectName;
	String BuildingType;
	String PhysicalAddress;
	String ERFNumber;
	String Fee;
	String AmountPaid;
	String Deadline;
	Boolean Finalized;
	
	//initializing my method  for the project
	public Project (int ProjectNumber, String ProjectName, String BuildingType, String PhysicalAddress, String ERFNumber, String Fee, String AmountPaid, String Deadline) {
		this.ProjectNumber = ProjectNumber;
		this.ProjectName = ProjectName;
		this.BuildingType = BuildingType;
		this.PhysicalAddress = PhysicalAddress;
		this.ERFNumber = ERFNumber;
		this.Fee = Fee;
		this.AmountPaid = AmountPaid;
		this.Deadline = Deadline;
		this.Finalized = false;
				
	}
	//changing amount paid to help new customer to put they amount the will like to pay
	public void changeAmountPaid (String newAmountPaid) {
		this.AmountPaid = newAmountPaid;
	}
	
	//changing a deadline
	public void changeDeadline (String newDeadline) {
		this.Deadline = newDeadline;
	}
	
	//finalizing the project
	public void finalizeProject() {
		this.Finalized = true;
	}
}
