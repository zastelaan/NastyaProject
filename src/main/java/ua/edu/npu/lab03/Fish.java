package ua.edu.npu.lab03;

public class Fish implements Swimming {
	public static void main(String[] args) {
		Fish fish = new Fish();
		fish.swim();
	}

	@Override
	public void swim() {
		System.out.println("I'm swimming");
	}
}
