package Day_9_Assignment;

public class UC_1EmpWage_AabPrs {

	//check employee present or absent 
	//_use((RANDOM))for attendance check
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		     int IS_FULL_TIME = 1;     //../local variable
		  
		     double empcheck = Math.floor(Math.random()*10)%2;
		     
		     if (empcheck == IS_FULL_TIME)
		        System.out.println("Employe Is Present");
		     else
	            System.out.println("Employe Is Absent"); 		 

		}
	}


