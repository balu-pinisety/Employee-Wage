public class EmpWageBuilder {

	//Constants
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	private final String company;
	private final int monthHours;
	private final int monthDays;
	private final int wageRate;
	private int totalWage;
	public static void main(String[] args) {
		//Creating objects for class
		EmpWageBuilder Comp1=new EmpWageBuilder("Company1",80, 25, 20);
		EmpWageBuilder Comp2=new EmpWageBuilder("Company2",100, 30, 25);
		//Computing total wage
		Comp1.computeWage();
		System.out.println(Comp1);
		Comp2.computeWage();
		System.out.println(Comp2);
	}
	public EmpWageBuilder(String company, int monthHours, int monthDays, int wageRate) {
		//Assigning to variables
		this.company=company;
		this.monthHours=monthHours;
		this.monthDays=monthDays;
		this.wageRate=wageRate;		
	}
	
	public void computeWage() {
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
		totalWage=totalWorkHrs*wageRate;
//		System.out.println("Total Employee Wage for "+Company+" is "+monthWage+"\n");
	}
	
	@Override
	public String toString() {
		//
		return "Total Employee Wage for "+company+" is "+totalWage+"\n";
	}
}
