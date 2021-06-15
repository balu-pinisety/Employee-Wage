public class EmpWageBuilder {

	public static void main(String[] args) {
		//Displaying Welcome Message
		System.out.println("Welcome to Employee Wage Computation Problem");
		//Constants
		int IS_FULL_TIME=1;
		//Computation
		int empCheck = (int) Math.floor(Math.random()*10)%2;
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	}
}