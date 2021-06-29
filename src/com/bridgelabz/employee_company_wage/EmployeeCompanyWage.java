package com.bridgelabz.employee_company_wage;

import java.util.Iterator;

public class EmployeeCompanyWage
{
	public static final int IS_FULLTIME_PRESENT  = 1;
	public static final int IS_PARTTIME_PRESENT = 2;
	
	private int numberOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray; 
	
	public EmployeeCompanyWage() 
	{
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	private void addCompanyEmpWage(int wagePerHour,int maxHours,int daysInMonth,String companyName)
	{
		companyEmpWageArray[numberOfCompany] = new CompanyEmpWage(maxHours, daysInMonth, wagePerHour, companyName);
		numberOfCompany++;
	}
	public void computeEmployeeWage() 
	{
		for (int index = 0; index < numberOfCompany; index++) 
		{
			CompanyEmpWage companyEmpWage = companyEmpWageArray[index];
			if(companyEmpWage != null)
			{
				int monthlyEmployeeWage = this.calculateWage(companyEmpWage);
				companyEmpWage.setTotalEmpWage(monthlyEmployeeWage);
				System.out.println(companyEmpWage);
			}
		}
	}
	
	public int calculateWage(CompanyEmpWage companyEmpWage) 
	{
		System.out.println("Welcome to Employee Company Wage");
		int totalWorkingHours = 0;
		int totalWorkingDays = 0;
		int monthlyWage = 0;
		
		while(totalWorkingHours<companyEmpWage.maxHours && totalWorkingDays<companyEmpWage.daysInMonth)
		{
			
			int dailyWage = 0;
			totalWorkingDays++;
			int employeeHours=0;
			
			double empCheck = Math.floor(Math.random() * 10 ) % 3;			
			switch ((int)empCheck)
			{
			case IS_FULLTIME_PRESENT : 
				employeeHours = 8;
				break;
				
			case IS_PARTTIME_PRESENT :
				employeeHours = 4;
				break;
			
			default:
				employeeHours = 0;
			}
			dailyWage = companyEmpWage.wagePerHour * employeeHours;
			totalWorkingHours += employeeHours;
			monthlyWage += dailyWage;
		}
		return monthlyWage;
	}
	
	public static void main(String[] args) {
		EmployeeCompanyWage wageBuilder = new EmployeeCompanyWage();
		wageBuilder.addCompanyEmpWage(100, 10, 20, "Dmart");
		wageBuilder.addCompanyEmpWage(200, 15, 25, "BigBazar");
		wageBuilder.computeEmployeeWage();
		
	}
}
