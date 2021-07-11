package com.yadyapi.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsWithCustomObjects {
	public static void main(String[] args) {
		Employee myEmployee = new Employee(1, "Manju", "Pai", 10000, 5, "Software Engineer", Gender.Male);
		Employee myEmployee2 = new Employee(2, "Aish", "Rai", 20000, 5, "Tester Engineer", Gender.Female);
		Employee myEmployee3 = new Employee(3, "Richard", "Anthony", 30000, 8, "Lead Engineer", Gender.Male);
		Employee myEmployee4 = new Employee(4, "Mary", "Luis", 40000, 9, "Lead Engineer", Gender.Female);
		Employee myEmployee5 = new Employee(5, "Sundar", "Pandey", 50000, 12, "Manager", Gender.Male);
		Employee myEmployee6 = new Employee(6, "Malathi", "Ranga", 100000, 15, "Senior Manager", Gender.Female);
		List<Employee> employeeList = Arrays.asList(myEmployee, myEmployee2, myEmployee3, myEmployee4, myEmployee5,
				myEmployee6);

		System.out.println(
				"*****Print First name,Last name and salary of Employees having Sala"
				+ "ry Greater than 10000 or less than 50000");
		employeeList.stream().filter(e -> (e.getEmpSalary() >= 20000 & e.getEmpSalary() < 50000))
				.forEach((e) -> System.out.println("First Name : " + e.getEmpFirstName() + ", Last Name : "
						+ e.getEmpLastName() + ", Salary : " + e.getEmpSalary()));
		// based on gender fetch employee first name and designation
		employeeList.stream().sorted(Comparator.comparing(Employee::getGender)).forEach((e) -> System.out.println(
				"Name => " + e.getEmpFirstName() + e.getEmpLastName() + ", Designation => " + e.getDesignation()));
		//get the employee details with highest salary
		Optional<Employee> maxSalaryEmpOptional= employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getEmpSalary)));
		System.out.println("Employee with Max Salary " + maxSalaryEmpOptional.get());
	}
}
