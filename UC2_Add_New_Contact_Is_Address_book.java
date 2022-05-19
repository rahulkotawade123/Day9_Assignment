package Day_9_Assignment;
import java.util.*;

public class UC2_Add_New_Contact_Is_Address_book {

		public static ContactDetails readDataFromConsole() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Details of Add Contact");
			System.out.println("Enter the first name");
			String firstName = sc.next();
			System.out.println("Enter the Last name");
			String lastName = sc.next();
			System.out.println("Enter the Address");
			String address = sc.next();
			System.out.println("Enter the City"); // getting from user input using console
			String city = sc.next();
			System.out.println("Enter the State");
			String state = sc.next();
			System.out.println("Enter the ZipCode");
			int zipCode = sc.nextInt();
			System.out.println("Enter the contact number...");
			String phoneNumber = sc.next();

			return new ContactDetails(firstName, lastName, address, city, state, zipCode, phoneNumber);
		}

		static ContactDetails editContactDetailsDetails(ContactDetails ContactDetails) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the Address");
			ContactDetails.address = sc.next();
			System.out.println("Enter the City");
			ContactDetails.city = sc.next();
			System.out.println("Enter the State");
			ContactDetails.state = sc.next();
			System.out.println("Enter the ZipCode");
			ContactDetails.zipCode = sc.nextInt();
			System.out.println("Enter the contact number...");
			ContactDetails.phoneNumber = sc.next();
			System.out.println("");
			return ContactDetails;

		}

	//menu baar
		

		public static void main(String[] args) {

			readDataFromConsole();

		}

	}

