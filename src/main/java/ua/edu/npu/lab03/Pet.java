package ua.edu.npu.lab03;

public abstract class Pet {
	String name;
	int age;

	Pet() {
		this("Незнайомець", 0);
	}

	Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
