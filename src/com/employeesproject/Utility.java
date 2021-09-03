package com.employeesproject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Utility {
	
	private final static List<Employee> employees = new ArrayList<Employee>();
	
	
	public static void addEmployee(Employee emp) {
		
		employees.add(emp);
		
	}
	
	public static void printEmployees() {
		
		for (Employee employee : employees) {
			if (employee.isActive() == true) {
			System.out.println("Employee ID: " + employee.getEmployeeId() + " Full Name: " + employee.getFirstName() + " " + employee.getLastName() + " Age: " + employee.getAge() + " Salary: " + employee.getSalary() + " Hired on: " + employee.getHireDate());
			} 
		}
	}
	
	public static void retireEmployee(int employeeId) {
		
		for (Employee employee : employees) {
			if (employee.getEmployeeId() == employeeId) {
				employee.setRetireDate(LocalDate.now());
				employee.setActive(false);
				System.out.println("This Employee with ID: " + employee.getEmployeeId() + " Name: " + employee.getFirstName() + employee.getLastName() + " is now Inactive ");
				break;
			}
			
		}
		
		
	}
	
	public static void retiredEmployeesRecord() {
		
		for (Employee employee : employees) {
			if (employee.isActive() == false) {
			System.out.println("Employee No: " + employee.getEmployeeId() + " Full Name: " + employee.getFirstName() + " " + employee.getLastName() + " Retired on: " + employee.getRetireDate());
			} 
		}
	}
	
	public static void employeeCount() {
		
		int counter = 0;
		
		for (Employee employee : employees) {
			if (employee.isActive() == true) {
				counter++;
				
			} 
		} System.out.println("Total Active Employees in the system: " + counter);
	}

}
