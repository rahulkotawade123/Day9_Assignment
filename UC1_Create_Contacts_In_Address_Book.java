package Day_9_Assignment;

public class UC1_Create_Contacts_In_Address_Book {

	String First_Name ;
	String Last_Name;
	String Address;
	String City;
	String State;
	int Zip_Code;
	String Phone_Number;
	String Email;
	
	public UC1_Create_Contacts_In_Address_Book(String First_Name,String Last_Name,String Address,String City,
			              String State,int Zip_Code,String Phone_Number,String Email) {
		this.First_Name=First_Name;
		this.Last_Name=Last_Name;
		this.Address=Address;
		this.City=City;
		this.State=State;
		this.Zip_Code=Zip_Code;
		this.Phone_Number=Phone_Number;
		this.Email=Email;
	}
		@Override
		public String toString() {
		return "AddressBook_Basic [ First_Name= "+First_Name +", Last_Name="
	                         		+Last_Name+ ", Address= " +Address+ ", City= "+City+
	                           	   ", State= "+State+ ", Zip_Code= " +Zip_Code+ 
	                           	   ", Phone_Number="+Phone_Number+" Email= "+Email+"]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UC1_Create_Contacts_In_Address_Book AB =new UC1_Create_Contacts_In_Address_Book("Rahul","Kothawade","Dist.Dhule",
				"Betawad","Mharastra",425403,"9970039038","rahulkothawade99@gmail.com");
		System.out.println(AB);
}
}