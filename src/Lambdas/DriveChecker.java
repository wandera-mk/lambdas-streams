package Lambdas;

public class DriveChecker {

	public boolean checkIfCanDrive(Employee employee) {
		return employee.getAge() > 18;
	}
}
