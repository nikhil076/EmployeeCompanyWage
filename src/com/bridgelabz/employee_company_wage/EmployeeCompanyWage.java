package com.bridgelabz.employee_company_wage;

public class EmployeeCompanyWage {
	public static final int IS_PRESENT = 1;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Company Wage");
		double empCheck = Math.floor(Math.random() * 10 ) % 2;
		
		if (empCheck == IS_PRESENT)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}
}
