package ua.edu.npu.lab03;

public class Duck extends Pet implements Flying, Swimming, Talking, Walking {
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.fly();
		duck.swim();
		duck.talk();
		duck.walk();
	}

	@Override
	public void fly() {
		System.out.println("I fly");
	}

	@Override
	public void swim() {
		System.out.println("I'm swimming");
	}

	@Override
	public void talk() {
		System.out.println("quack-quack");
	}

	@Override
	public void walk() {
		System.out.println("I go");
	}
}
