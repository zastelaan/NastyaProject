package ua.npu.edu.lab03;

public class Pet {
	String name;
	int age;

	Pet() {
		this("Незнайомець", 0);
	}

	Pet(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this.name + "  " + this.age);
	}

}
