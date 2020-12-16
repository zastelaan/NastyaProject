package ua.npu.edu.lab04;

public class App {
	public static void main(String[] args) {
		ArrayStack arrayStack = new ArrayStack(85);
		ArrayListStack arrayListStack = new ArrayListStack();
		arrayStack.push(4);
		arrayStack.push(65);
		arrayStack.isEmpty();
		arrayStack.pop();
		arrayStack.size();
		arrayStack.clear();

		arrayListStack.push(5);
		arrayListStack.push(88);
		arrayListStack.pop();
		arrayListStack.clear();
		arrayListStack.size();
		arrayListStack.isEmpty();
	}
}
