package com.bridgelabz.employee_company_wage;

public class EmployeeCompanyWage {
	public static final int IS_PRESENT = 1;
	public static final int WAGE_PER_DAY = 20;
	public static final int FULL_DAY = 8;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Company Wage");
		int dailyWage = 0;
		double empCheck = Math.floor(Math.random() * 10 ) % 2;
		
		if (empCheck == IS_PRESENT)
		{
			dailyWage = WAGE_PER_DAY * FULL_DAY;
			System.out.println("Employee is present");
			System.out.println("Employee Daily wage for full day is :"+dailyWage);
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}
}
