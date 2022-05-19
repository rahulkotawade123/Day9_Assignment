package Day_9_Assignment;

public class UC_8EW_Multi_Comp_Uc_8 {

	 static final int PART_TIME = 1;	
	 static final int FULL_TIME = 2;
	 final String COMPANY_NAME;	
	 final int WAGE_PER_HR;
	 final int MAX_WORKING_DAYS;
	 final int MAX_WORKING_HRS;
	 int totalWage;
	 UC_8EW_Multi_Comp_Uc_8(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
	 {
		 COMPANY_NAME = companyName;
		 WAGE_PER_HR = wagePerHr;
		 MAX_WORKING_DAYS = maxWorkingDays;	
		 MAX_WORKING_HRS = maxWorkingHrs;	
		 totalWage = 0;
		 }
	 
	 int getEmpType()
	 {		
		 return (int) (Math.random() * 100) % 3;
		 } 
	 int getWorkingHrs(int empType) 
	 {	
		 switch (empType)
		 {
		 case FULL_TIME:	
			 return 8;
		 case PART_TIME:
			 return 4;		
		 default:		
			 return 0;		
					 }
		 }
	 void calculateTotalWage()
	 {
		 int workingHrs;
		 for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS			
			 && totalWorkingHrs <= MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs) 
		 {
			 int empType = getEmpType();
			 workingHrs = getWorkingHrs(empType);		
			 int wage = workingHrs * WAGE_PER_HR;			
			 totalWage += wage; 		

			 }
		 }
	 public String toString()
	 {
		 System.out.println("Details of " + COMPANY_NAME +" "+"employee");
		 System.out.println("Wage per hour:" + WAGE_PER_HR);
		 System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
		 System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
		 return "Total wage for a month of "+COMPANY_NAME +"employee is"+totalWage+"\n";
	    }
	    public static void main(String[] args) {
	    	
	    	UC_8EW_Multi_Comp_Uc_8 Dmart = new UC_8EW_Multi_Comp_Uc_8("Dmart",100,20,100);
	    	UC_8EW_Multi_Comp_Uc_8 SuperMart = new UC_8EW_Multi_Comp_Uc_8("superMart",150,20,150);

			 System.out.println("EmpWage Multi Company List");

	    Dmart.calculateTotalWage();
	    System.out.println(Dmart);
	    
	    SuperMart.calculateTotalWage();
	    System.out.println(SuperMart);
	    
	 }
}
