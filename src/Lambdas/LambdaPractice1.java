package Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaPractice1 {

	/**
	 * Write a method that takes a list of
	 * employees and prints names of all employees older than 40
	 *
	 */

	public static void main(String[] args) {
		List<Employee> wanderaEmployees = new ArrayList<>();

		Printer printer = new Printer();

		wanderaEmployees.add(new Employee("Martin", 20));
		wanderaEmployees.add(new Employee("Zdenda", 24));
		wanderaEmployees.add(new Employee("Petr", 22));
		wanderaEmployees.add(new Employee("Dusan", 32));


		for(Employee employee: wanderaEmployees) {
			if(employee.getAge() > 25)
				printer.formatAndPrint(employee);
		}

		



		wanderaEmployees.stream()
				.filter(employee -> employee.getAge() > 25)
				.forEach(employee -> printer.formatAndPrint(employee));






		wanderaEmployees.stream()
				.filter(employee -> employee.getAge() > 25)
				.forEach(employee -> System.out.println(employee.getName()));






	}
}
