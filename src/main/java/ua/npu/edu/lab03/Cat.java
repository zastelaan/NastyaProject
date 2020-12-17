package ua.npu.edu.lab03;

public class Cat implements Talking, Walking {

	@Override
	public void talk() {
		System.out.println("meow-meow");
	}

	@Override
	public void walk() {
		System.out.println("i go");
	}
}
