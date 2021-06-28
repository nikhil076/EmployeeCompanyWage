package com.bridgelabz.employee_company_wage;

public class EmployeeCompanyWage {
	public static final int IS_FULLTIME_PRESENT  = 1;
	public static final int IS_PARTTIME_PRESENT = 2;
	public static final int WAGE_PER_DAY = 20;
	public static final int FULL_DAY = 8;
	public static final int PART_TIME = 4;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Company Wage");
		int dailyWage = 0;
		double empCheck = Math.floor(Math.random() * 10 ) % 3;
		
		switch ((int)empCheck) {
		case IS_FULLTIME_PRESENT : 
			dailyWage = WAGE_PER_DAY * FULL_DAY;
			System.out.println("Employee is present for full day");
			System.out.println("Employee Daily wage for full day is :"+dailyWage);
			break;
			
		case IS_PARTTIME_PRESENT :
			dailyWage = WAGE_PER_DAY * PART_TIME;
			System.out.println("Employee is present for part time");
			System.out.println("Employee daily wage for part time is :"+dailyWage);
			break;
		
		default:
			System.out.println("Employee is absent");
		}
	}
}
