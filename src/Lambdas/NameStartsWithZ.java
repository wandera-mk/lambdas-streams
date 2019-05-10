package Lambdas;

import java.util.function.Predicate;

public class NameStartsWithZ implements Predicate<Employee> {

	@Override
	public boolean test(Employee t) {
		return t.getName().substring(0, 1).equals("Z");
	}
}
