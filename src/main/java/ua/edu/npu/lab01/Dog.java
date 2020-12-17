package ua.edu.npu.lab01;

public class Dog {
	private int age;
	private String name;
	private static int numOfDogs = 0;

	Dog() {
		this("Незнайомець", 0);
	}

	Dog(String name, int age) {
		this.name = name;
		this.age = age;
		setNumOfDogs(getNumOfDogs() + 1);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void voice() {
		for (int i = 0; i < this.age; i++) {
			System.out.println("гав");
		}
	}

	public static int getNumOfDogs() {
		return numOfDogs;
	}

	public static void setNumOfDogs(int numOfDogs) {
		Dog.numOfDogs = numOfDogs;
	}
}
