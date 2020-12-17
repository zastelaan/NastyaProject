package ua.edu.npu.lab01;

public class Dog {
    private int age;
    private String name;

    Dog() {
        this("Незнайомець", 0);
    }

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void voice() {
        for(int i = 0; i < this.age; ++i) {
            System.out.println("гав");
        }

    }
}