package com.bridgelabz.employee_company_wage;

public class EmployeeCompanyWage {
	public static final int IS_FULLTIME_PRESENT  = 1;
	public static final int IS_PARTTIME_PRESENT = 2;

	public static void calculateWage(int wagePerHour,int maxHours,int daysInMonth,String companyName) 
	{
		System.out.println("Welcome to Employee Company Wage");
		int totalWorkingHours = 0;
		int totalWorkingDays = 0;
		int monthlyWage = 0;
		
		while(totalWorkingHours<maxHours && totalWorkingDays<daysInMonth){
			
			int dailyWage = 0;
			totalWorkingDays++;
			int employeeHours=0;
			
			double empCheck = Math.floor(Math.random() * 10 ) % 3;			
			switch ((int)empCheck) {
			case IS_FULLTIME_PRESENT : 
				employeeHours = 8;
				break;
				
			case IS_PARTTIME_PRESENT :
				employeeHours = 4;
				break;
			
			default:
				employeeHours = 0;
			}
			dailyWage = wagePerHour * employeeHours;
			totalWorkingHours += employeeHours;
			monthlyWage += dailyWage;
		}
		System.out.println("Total Working Days :"+totalWorkingDays);
		System.out.println("Total Wokking hours :"+totalWorkingHours);
		System.out.println("Monthly employee wage for "+companyName+" is :"+monthlyWage);
	}
	
	public static void main(String[] args) {
		calculateWage(100,10,20,"Dmart");
		System.out.println();
		calculateWage(200,15,25,"BigBazar");
	}
}
