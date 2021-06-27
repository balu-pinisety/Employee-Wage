package com.EmpWageComputing;

public class CompanyWage {
	//Variables
	public final String company;
	public final int monthHours;
	public final int monthDays;
	public final int wageRate;
	public int totalWage;
	
	public CompanyWage(String company, int monthHours, int monthDays, int wageRate) {
		//Assigning to variables
		this.company=company;
		this.monthHours=monthHours;
		this.monthDays=monthDays;
		this.wageRate=wageRate;		
	}
	
	public void setTotalWage(int totalWage) {
		this.totalWage=totalWage;
	}
	
	@Override
	public String toString() {
		return "\nTotal Employee Wage for "+company+" is "+totalWage;
	}
}
