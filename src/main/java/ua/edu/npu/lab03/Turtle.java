package ua.edu.npu.lab03;

public class Turtle implements Swimming, Walking {
	public static void main(String[] args) {
		Turtle turtle = new Turtle();
		turtle.swim();
		turtle.walk();
	}

	@Override
	public void swim() {
		System.out.println("I'm swimming");
	}

	@Override
	public void walk() {
		System.out.println("I go");
	}
}
