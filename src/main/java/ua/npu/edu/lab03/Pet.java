package ua.npu.edu.lab03;

public class Pet {
	private String name;
	private int age;

	Pet() {
		this("Незнайомець", 0);
	}

	Pet(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this.name + "  " + this.age);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
