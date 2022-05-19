package Day_9_Assignment;

public class UC_5EmpWageMonth{
	//calculating Wages For a Month
	//_assume 20 working day per month
	
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_WAGE_PER_HOUR = 20;
    public static final int MONTH_OF_WORKING_DAYS = 20;

    public void calWageMonth() {
	     int emphrs = 0;
	     int empwage = 0;
	     int totalEmpWage = 0;
	     System.out.println("Calculating Wages For A Month");

	     int empcheck = (int) Math.floor(Math.random()*10)%3;
	     switch (empcheck) {
	         case IS_FULL_TIME :
	    	 emphrs = 8;
	    	 break;
	    	 case IS_PART_TIME :
	    	 emphrs = 4;
	    	 break;
	    	 default:
	         emphrs=0;
	     }
	     empwage = emphrs*EMP_WAGE_PER_HOUR;
        System.out.println("Emp wage:"+empwage+"  "+"emp Hrs:"+emphrs); 
	}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	UC_4EmpWageSwitch cs = new UC_4EmpWageSwitch();
    	cs.caseStaement();
}
}
