package Day_9_Assignment;

public class UC_3EmpWagePartTime {

	//add part time employee & wage
	//_assune part time is 8

	 private static int IS_FULL_TIME = 2;
	 private static int IS_PART_TIME = 1;
	  static int EMP_WAGE_PER_HOUR = 20;
	  
      public void partTime() {
    	
    	  int emphrs = 0;
    	  int empwage = 0;

    	  double empcheck = Math.floor(Math.random()*10)%3;
    	  
    	  if (empcheck == IS_FULL_TIME)
    	  	 emphrs = 10;

    	   else if  (empcheck == IS_PART_TIME)
    	  	 emphrs = 8;
    	   empwage = emphrs*EMP_WAGE_PER_HOUR;
    	   System.out.println("Emp Wage Part Time");

    	    System.out.println("Emp wage:"+empwage+" "+"emp Hrs"+emphrs); 
    	  }

      public static void main(String[] args) {
			// TODO Auto-generated method stub
    	  UC_3EmpWagePartTime pt = new UC_3EmpWagePartTime();
    	  pt.partTime();
    	  }
}
