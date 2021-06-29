package com.bridgelabz.employee_company_wage;
	
public class CompanyEmpWage {
	
	public final int maxHours;
	public final int daysInMonth ;
	public final int wagePerHour ;
	public final String companyName;
	public int totalEmpWage;
	
	public CompanyEmpWage(int maxHours, int daysInMonth, int wagePerHour, String companyName) {
		super();
		this.maxHours = maxHours;
		this.daysInMonth = daysInMonth;
		this.wagePerHour = wagePerHour;
		this.companyName = companyName;
	}

	public int getTotalEmpWage() {
		return totalEmpWage;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "Company Employee Wage for "+companyName +" is : " + totalEmpWage ;
	}
	
	
}
