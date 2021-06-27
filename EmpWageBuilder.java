package com.EmpWageComputing;

public class EmpWageBuilder {

	//Constants
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	
	//variable
	private int companyNumb = 0;
	private CompanyWage[] companyArray;
	
	public EmpWageBuilder() {
		companyArray= new CompanyWage[5];
	}
	
	private void addCompanyWage(String company, int monthHours, int monthDays, int wageRate) {
		companyArray[companyNumb]= new CompanyWage(company, monthHours, monthDays, wageRate);
		companyNumb++;
	}
	
	private void computeWage() {
		for (int i=0; i<companyNumb;i++) {
			companyArray[i].setTotalWage(this.computeWage(companyArray[i]));
			System.out.println(companyArray[i]);
		}
	}
	
	private int computeWage(CompanyWage companyWage) {
		//variables
		int empWorkHrs;
		int totalWorkHrs=0;
		int daysCount=0;
		//Calculating wage
		while (totalWorkHrs<=companyWage.monthHours && daysCount<companyWage.monthDays){
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
		return totalWorkHrs*companyWage.wageRate;
	}
	
	public static void main(String[] args) {
		//Creating objects for class
		EmpWageBuilder empWageObj=new EmpWageBuilder();
		empWageObj.addCompanyWage("Company1",80, 25, 20);
		empWageObj.addCompanyWage("Company2",90, 30, 25);
		empWageObj.addCompanyWage("Company3",70, 20, 18);
		//Computing total wage
		empWageObj.computeWage();
	}
	
}
