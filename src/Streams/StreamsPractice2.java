package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Lambdas.Employee;

public class StreamsPractice2 {

	/**
	 * Write a method that takes a list of
	 * employees and creates another list with employees
	 * who are younger than 50 and their name is longer or equal than 5 characters
	 */

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Natasha", 34));
		employees.add(new Employee("Tony", 48));
		employees.add(new Employee("Steve", 100));
		employees.add(new Employee("Clint", 46));
		employees.add(new Employee("Bruce", 49));


		List<Employee> filteredList = new ArrayList<>();

	}
}
