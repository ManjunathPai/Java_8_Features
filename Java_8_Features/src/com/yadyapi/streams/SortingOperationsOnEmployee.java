package com.yadyapi.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class SortingOperationsOnEmployee {

	public static void main(String[] args) {
		Employee myEmployee = new Employee(1, "Manju", "Pai", 15000, 5, "Software Engineer", Gender.Male);
		Employee myEmployee2 = new Employee(2, "Aish", "Rai", 20000, 5, "Tester Engineer", Gender.Female);
		Employee myEmployee3 = new Employee(3, "Richard", "Anthony", 40000, 8, "Lead Engineer", Gender.Male);
		Employee myEmployee4 = new Employee(4, "Mary", "Luis", 80000, 9, "Lead Engineer", Gender.Female);
		Employee myEmployee5 = new Employee(5, "Sundar", "Pandey", 100000, 12, "Manager", Gender.Male);
		Employee myEmployee6 = new Employee(6, "Malathi", "Swamy", 90000, 15, "Senior Manager", Gender.Female);
		List<Employee> employeeList = Arrays.asList(myEmployee, myEmployee2, myEmployee3, myEmployee4, myEmployee5,
				myEmployee6);
		// sort based on first name
		employeeList.sort(Comparator.comparing(Employee::getEmpFirstName));
		employeeList.forEach(e -> System.out.println(e));
		// sort based on salary
		System.out.println("sort based on salary");
		employeeList.sort(Comparator.comparing(Employee::getEmpSalary));
		employeeList.forEach(e -> System.out.println(e));
		// Sort based on gender and display first name and salary
		employeeList.stream().sorted(Comparator.comparing(Employee::getGender)).filter(e -> e.getEmpSalary() > 20000)
				.forEach((e) -> System.out.println("First Name:"+e.getEmpFirstName()+",Salary:"+e.getEmpSalary()));

	}
}
