package Streams;

import java.util.ArrayList;
import java.util.List;

import Lambdas.Employee;

public class StreamsPractice1 {

	/**
	 * Write a method that takes a list of
	 * employees and prints names of all employees older than 40
	 * and sort them alhabetically
	 */

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Natasha", 34));
		employees.add(new Employee("Tony", 48));
		employees.add(new Employee("Steve", 100));
		employees.add(new Employee("Clint", 46));
		employees.add(new Employee("Bruce", 49));

	}
}
