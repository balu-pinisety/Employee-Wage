public class EmpWageBuilder {

	//Constants
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int WAGE_PER_HOUR=20;
	public static final int MONTH_DAYS=20;
	public static final int MONTH_HRS=100;
	
	public static void main(String[] args) {
		//Displaying Welcome Message
		System.out.println("Welcome to Employee Wage Computation Problem\n");
		//variables
		int empWorkHrs;
		int totalWorkHrs=0;
		int daysCount=0;
		//Calculating wage till MONTH_DAYS or MONTH_HRS is reached
		while (totalWorkHrs<=MONTH_HRS && daysCount<MONTH_DAYS){
			//Computation using Switch case
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch (empCheck) {
				case IS_FULL_TIME: {
					//System.out.println("Employee is Present\n");
					empWorkHrs=8;
					break;
				}
				case IS_PART_TIME: { 
					//System.out.println("Employee is Part-time Present\n");
					empWorkHrs=4;
					break;
				}
				default: {
					//System.out.println("Employee is Absent\n");
					empWorkHrs=0;
				}
			}
			//Calculating Employee Total Working Hrs
				totalWorkHrs+=empWorkHrs;
				//Incrementing the Month working day
				daysCount++;
		}
		//Calculating Employee Monthly Wage
		int monthWage=totalWorkHrs*WAGE_PER_HOUR;
		System.out.println("Employee Wage for Month of days "+daysCount+" is "+monthWage+" for working hours of "+totalWorkHrs+"\n");
	}
}