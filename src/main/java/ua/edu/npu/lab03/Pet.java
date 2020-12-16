package ua.edu.npu.lab03;

public abstract class Pet {
	private String name;
	private int age;

	Pet() {
		this("Незнайомець", 0);
	}

	Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
