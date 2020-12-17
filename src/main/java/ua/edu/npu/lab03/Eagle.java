package ua.edu.npu.lab03;

public class Eagle implements Flying, Talking, Walking {
	public static void main(String[] args) {
		Eagle eagle = new Eagle();
		eagle.fly();
		eagle.talk();
		eagle.walk();
	}

	@Override
	public void fly() {
		System.out.println("I fly");
	}

	@Override
	public void talk() {
		System.out.println("kar-kar-kar");
	}

	@Override
	public void walk() {
		System.out.println("I go");
	}
}
