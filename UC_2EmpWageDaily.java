package Day_9_Assignment;

public class UC_2EmpWageDaily {

	//calculate employee wage 
		//_Assume wage per hour is 20
		//_Assume full day hour is 8
		
	static int IS_FULL_TIME = 1;       
    static int EMP_WAGE_PER_HOUR = 20;
    
		public void calWage() {

		     int emphrs = 0;                  //....local variable
		     int empwage = 0;
			   System.out.println("Calculate Employee Wage");

		     double empcheck = Math.floor(Math.random()*10)%2;
		     
		     if (empcheck == IS_FULL_TIME)
		    	 emphrs = 8;
		     else
		    	 emphrs = 0;
		     empwage = emphrs*EMP_WAGE_PER_HOUR;
	           System.out.println("Emp wage:"+empwage+" "+"emphrs:"+emphrs); 
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			UC_2EmpWageDaily cl = new UC_2EmpWageDaily();
			cl.calWage();
		}
	}


