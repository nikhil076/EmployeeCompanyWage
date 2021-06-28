package com.bridgelabz.employee_company_wage;

public class EmployeeCompanyWage {
	public static final int IS_FULLTIME_PRESENT  = 1;
	public static final int IS_PARTTIME_PRESENT = 2;
	public static final int WAGE_PER_DAY = 20;
	public static final int FULL_DAY = 8;
	public static final int PART_TIME = 4;
	public static final int WORKING_DAYS_PER_MONTH = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Company Wage");
		int MONTHLY_WAGE = 0;
		
		for (int i=0; i<WORKING_DAYS_PER_MONTH; i++)
		{
			int DAILY_WAGE = 0;
			double empCheck = Math.floor(Math.random() * 10 ) % 3;
			
			switch ((int)empCheck) {
			case IS_FULLTIME_PRESENT : 
				DAILY_WAGE = WAGE_PER_DAY * FULL_DAY;
				break;
				
			case IS_PARTTIME_PRESENT :
				DAILY_WAGE = WAGE_PER_DAY * PART_TIME;
				break;
			
			default:
			}
			MONTHLY_WAGE = MONTHLY_WAGE + DAILY_WAGE;
		}
		System.out.println("Monthly employee wage :"+MONTHLY_WAGE);
	}
}
