package Lambdas;

public class Lambdas {

	public static void main(String[] args) {

		Employee martin = new Employee("Martin", 20);
		Employee zdenda = new Employee("Zdenda", 24);


		DriveChecker driveChecker = new DriveChecker();
		if (driveChecker.checkIfCanDrive(martin)) {
			System.out.println("Yes");
		} else {
			System.out.println("No!");
		}


		FrequentNameChecker frequentNameChecker = new FrequentNameChecker();
		if (frequentNameChecker.checkIfHasFrequentName(zdenda)) {
			System.out.println("Yes");
		} else {
			System.out.println("No!");
		}



		NameStartsWithZ nameStartsWithZ = new NameStartsWithZ();
		if (nameStartsWithZ.test(zdenda)) {
			System.out.println("Yes");
		} else {
			System.out.println("No!");
		}
	}

}
