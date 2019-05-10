package Lambdas;

import java.util.function.Predicate;

public class LambdasNew {

	public static void main(String[] args) throws Exception {

		Employee martin = new Employee("Martin", 20);
		Employee zdenda = new Employee("Zdenda", 24);

		Predicate nameStartsZ = new NameStartsWithZ();
		//Predicate driveChecker = new Lambdas.DriveChecker();
		//Predicate frequentName = new Lambdas.FrequentNameChecker();

		validate(nameStartsZ, martin);
		//validate(driveChecker, zdenda);
		//validate(frequentName, zdenda);


		validate(empl -> martin.getName().substring(0, 1).equals("Z"), martin);
	}

	private static void validate(Predicate p, Employee e) {
		if (p.test(e)) {
			System.out.println("Yes");
		} else {
			System.out.println("No!");
		}
	}

}
