package Constructors;
// Constructors Example in Java

class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default constructor called!");
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;   // "this" refers to current object
        this.age = age;
        System.out.println("Parameterized constructor called!");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Calling default constructor
        Student s1 = new Student();
        s1.display();

        // Calling parameterized constructor
        Student s2 = new Student("Somveer", 20);
        s2.display();
    }
}
