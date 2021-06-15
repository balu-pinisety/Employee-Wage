public class EmpWageBuilder {

	public static void main(String[] args) {
		//Displaying Welcome Message
		System.out.println("Welcome to Employee Wage Computation Problem\n");
		//Constants
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
		int WAGE_PER_HOUR=20;
		//variables
		int empWorkHrs;
		//Computation
		int empCheck = (int) Math.floor(Math.random()*10)%3;
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present\n");
			empWorkHrs=8;
		}
		else if (empCheck == IS_PART_TIME) {
			System.out.println("Employee is Part-time Present\n");
			empWorkHrs=4;
		}
		else {
			System.out.println("Employee is Absent\n");
			empWorkHrs=0;
		}
		//Calculating Employee Daily Wage
		int empWage=empWorkHrs*WAGE_PER_HOUR;
		System.out.println("Employee Wage: "+empWage+"\n");
	}
}