public class EmpWageBuilder {

	public static void main(String[] args) {
		//Displaying Welcome Message
		System.out.println("Welcome to Employee Wage Computation Problem\n");
		//Constants
		int IS_FULL_TIME=1;
		int WAGE_PER_HOUR=20;
		//variables
		int empWorkHrs;
		//Computation
		int empCheck = (int) Math.floor(Math.random()*10)%2;
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present\n");
			empWorkHrs=8;
		}
		else {
			System.out.println("Employee is Absent\n");
			empWorkHrs=0;
		}
		int empWage=empWorkHrs*WAGE_PER_HOUR;
		System.out.println("Employee Wage: "+empWage+"\n");
	}
}