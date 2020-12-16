package ua.edu.npu.lab03;

public class Dog implements Talking, Walking {
	public static void main(String[] args) {
		Pet dog1 = new Pet("Robert", 12);
		Pet dog2 = new Pet();
		Dog dog = new Dog();
		dog.talk();
		dog.walk();
	}

	@Override
	public void talk() {
		System.out.println("woof-woof");
	}

	@Override
	public void walk() {
		System.out.println("I go");
	}
}
