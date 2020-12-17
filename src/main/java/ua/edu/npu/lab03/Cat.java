package ua.edu.npu.lab03;

public class Cat implements Talking, Walking {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.talk();
		cat.walk();
	}

	@Override
	public void talk() {
		System.out.println("meow-meow");
	}

	@Override
	public void walk() {
		System.out.println("i go");
	}
}
