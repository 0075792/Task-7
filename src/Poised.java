import java.util.*;
public class Poised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Menu options
        System.out.println("Welcome to Poised by Balonde!");
        System.out.println("Please select from the following options: ");
        System.out.println("1. Create a new project");
        System.out.println("2. Change the due date of a project");
        System.out.println("3. Change the total amount paid");
        System.out.println("4. Update a contractor's details");
        System.out.println("5. Finalize the project");

        //Scanner
        Scanner sc = new Scanner(System.in);
        String user_choice = sc.next();
        
      //switch statement for user_choice
        switch(user_choice){
            case "1":
                // in case 1 we are going to ask a user to enter the detail about the project 
                System.out.println("Please enter the project number: ");
                int newprojectNumber = sc.nextInt();
                System.out.println("Please enter the project name: ");
                String newprojectName = sc.next();
                System.out.println("Please enter the type of building: ");
                String newbuildingType = sc.next();
                System.out.println("Please enter the physical address of the building: ");
                String newphysicalAddress = sc.next();
                System.out.println("Please enter the ERF number: ");
                String newerfNumber = sc.nextLine();
                System.out.println("Please enter the total fee: ");
                String newFee = sc.next();
                System.out.println("Please enter the amount paid thusfar: ");
                String AmountPaid = sc.next();
                System.out.println("Please enter the deadline: ");
                String Deadline = sc.next();
                Project newProject = new Project(newprojectNumber, newprojectName, newbuildingType, newphysicalAddress, newerfNumber, newFee, AmountPaid, Deadline);
            case "2":
                //in case 2 we are asking a user to the date for new project 
            	System.out.println("Please enter the new date for the project: ");
                String userDate = sc.next();
                
            case "3":
               //in case 3 we ask a user to enter total paid amount for the project 
            	System.out.println("Please enter the new total paid amount: ");
                int userTotalPaid = sc.nextInt();
            case "4":
                // in case 4 we ask a user to enter the detail  of the contractor
            	System.out.println("Please enter the name of the contractor: ");
                String contractorName = sc.next();
                System.out.println("Please enter the Surname of the contractor: ");
                String contractorSurname = sc.next();
                System.out.println("Please enter the new telephone number: ");
                String contractorTelephoneNumber = sc.next();
                System.out.println("Please enter the new email address: ");
                String contractorEmail = sc.next();
                System.out.println("Please enter the new physical address: ");
                String ContractorAddress = sc.next();
                Person newPerson = new Person(contractorName, contractorSurname, contractorTelephoneNumber, contractorEmail, ContractorAddress);
            case "5":
               // in case 5 if the user enter something according to the project statement it will break
            	break;
            default:
               // if the user enter unexpected message the computer will give invalud choice
            	throw new IllegalStateException("Unexpected value: " + user_choice);
        }
        
        

	}

}
