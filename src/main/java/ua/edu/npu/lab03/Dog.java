package ua.edu.npu.lab03;

public class Dog extends Pet {

    Dog() {
        super();
    }

    Dog(String name, int age) {
        super(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void voice() {
        for (int i = 0; i < this.age; i++) {
            System.out.println("гав");
        }
    }
}

