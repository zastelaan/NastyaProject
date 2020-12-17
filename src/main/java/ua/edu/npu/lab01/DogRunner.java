package ua.edu.npu.lab01;

public class DogRunner {
    public DogRunner() {
    }

    public static void main(String[] args) {
        Dog pug = new Dog();
        Dog sheperd = new Dog("Peter", 4);
        sheperd.voice();
        System.out.println(pug.getName());
        System.out.println(pug.getAge());
    }
}
