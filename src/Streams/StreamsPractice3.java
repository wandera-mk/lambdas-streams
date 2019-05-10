package Streams;

import java.util.ArrayList;
import java.util.List;

import Lambdas.Employee;

public class StreamsPractice3 {

	/**
	 * Write a method that takes a list of
	 * employees and returns sum of age of avengers
	 */

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Natasha", 34));
		employees.add(new Employee("Tony", 48));
		employees.add(new Employee("Steve", 100));
		employees.add(new Employee("Clint", 46));
		employees.add(new Employee("Bruce", 49));
		employees.add(new Employee("Thanos", 15000));
		
	}

	private static boolean isAvenger(Employee e) {
		if(e.getName().equals("Thanos"))
			return false;
		return true;
	}
}
