package ua.npu.edu.lab03;

public class Turtle implements Swimming, Walking {


	@Override
	public void swim() {
		System.out.println("I'm swimming");
	}

	@Override
	public void walk() {
		System.out.println("I go");
	}
}
