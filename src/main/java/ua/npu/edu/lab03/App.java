package ua.npu.edu.lab03;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.talk();
        cat.walk();

        Duck duck = new Duck();
        duck.fly();
        duck.swim();
        duck.talk();
        duck.walk();

        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.talk();
        eagle.walk();

        Fish fish = new Fish();
        fish.swim();

        Turtle turtle = new Turtle();
        turtle.swim();
        turtle.walk();
    }
}
