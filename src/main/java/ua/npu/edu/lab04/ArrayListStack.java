package ua.npu.edu.lab04;

import java.util.ArrayList;

public class ArrayListStack implements Stack {

	private static ArrayList<Integer> a = new ArrayList<>();
	private int top = -1;

	public static void main(String[] args) {
		ArrayListStack arrayStack = new ArrayListStack();
		arrayStack.push(5);
		arrayStack.push(44);
		arrayStack.push(7);
		for (Integer element : a) {
			System.out.print(element + "  ");
		}
		arrayStack.pop();
		arrayStack.size();
		arrayStack.isEmpty();
		arrayStack.clear();
	}

	@Override
	public void push(int data) {
		a.add(0, data);
		top = 0;
	}

	@Override
	public int pop() {
		a.remove(0);
		return a.get(0);
	}

	@Override
	public int size() {
		return a.size();
	}

	@Override
	public boolean isEmpty() {
		return a.isEmpty();
	}

	@Override
	public void clear() {
		a.clear();
	}
}
