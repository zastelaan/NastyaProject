package ua.npu.edu.lab03;

public class Eagle implements Flying, Talking, Walking {

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
