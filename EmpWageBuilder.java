public class EmpWageBuilder {

	//Constants
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;

	public static void main(String[] args) {
		computeWage("Company1",80, 25, 20);
		computeWage("Company2",100, 30, 25);
	}
	public static void computeWage(String Company, int monthHours, int monthDays, int wageRate) {
		//variables
		int empWorkHrs;
		int totalWorkHrs=0;
		int daysCount=0;
		//Calculating wage till MONTH_DAYS or MONTH_HRS is reached
		while (totalWorkHrs<=monthHours && daysCount<monthDays){
			//Computation using Switch case
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch (empCheck) {
				case IS_FULL_TIME: {
					empWorkHrs=8;
					break;
				}
				case IS_PART_TIME: { 
					empWorkHrs=4;
					break;
				}
				default: {
					empWorkHrs=0;
				}
			}
			//Calculating Employee Total Working Hrs
				totalWorkHrs+=empWorkHrs;
				//Incrementing the Month working day
				daysCount++;
		}
		//Calculating Employee Monthly Wage
		int monthWage=totalWorkHrs*wageRate;
		System.out.println("Total Employee Wage for "+Company+" is "+monthWage+"\n");
	}
}
