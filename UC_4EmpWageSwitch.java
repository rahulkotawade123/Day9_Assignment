package Day_9_Assignment;

public class UC_4EmpWageSwitch {

	//solving using switch case statement
	
    public static final int IS_FULL_TIME = 1;          //.....static final
    public static final int IS_PART_TIME = 2;
    public static final int EMP_WAGE_PER_HOUR = 20;
    
    public void caseStaement() {
    int emphrs = 0;                           //.....local variable
    int empwage = 0;
    System.out.println("Switch Case Statement");

    int empcheck = (int) Math.floor(Math.random()*10)%3;
    
    switch (empcheck) {
     case IS_FULL_TIME :
   	  emphrs = 10;
   	  break;
     case IS_PART_TIME :
   	  emphrs = 8;
   	  break;
   	 default:
       emphrs=0;
    }
      empwage = emphrs*EMP_WAGE_PER_HOUR;
      System.out.println("Emp wage:"+empwage+"   "+"emp Hrs:"+emphrs); 
}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	UC_4EmpWageSwitch cs = new UC_4EmpWageSwitch();
    	cs.caseStaement();
    }
}        

