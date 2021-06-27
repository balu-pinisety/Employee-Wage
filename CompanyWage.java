package com.EmpWageComputing;

public class CompanyWage {
	//Variables
	public final String company;
	public final int monthHours;
	public final int monthDays;
	public final int wageRate;
	public int totalWage;
	
	/**
	 * To assign the values to variables by parameter calling
	 * @param company
	 * @param monthHours
	 * @param monthDays
	 * @param wageRate
	 */
	public CompanyWage(String company, int monthHours, int monthDays, int wageRate) {
		//Assigning to variables
		this.company=company;
		this.monthHours=monthHours;
		this.monthDays=monthDays;
		this.wageRate=wageRate;		
	}
	
	/**
	 * To set the value of Employee total Wage
	 * @param totalWage
	 */
	public void setTotalWage(int totalWage) {
		this.totalWage=totalWage;
	}
	
	/**
	 *Returns the output value 
	 */
	@Override
	public String toString() {
		return "\nTotal Employee Wage for "+company+" is "+totalWage;
	}
}
