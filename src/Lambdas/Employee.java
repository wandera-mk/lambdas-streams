package Lambdas;

public class Employee {

	int age;
	String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name, int age) {
		this.age = age;
		this.name = name;
	}
}
