package Encapsulation;
//Encapsulation Example in Java

/*
- Encapsulation = wrapping data (variables) and methods together in a single unit (class).
- Variables are kept private and accessed via public getters & setters.
- It provides Data Hiding and Security.
*/

class Student {
    // Private variables (data hiding)
    private String name;
    private int age;

    // Getter methods (to access private data)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods (to modify private data)
    public void setName(String name) {
        // "this" refers to instance variables (class fields)
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {   // simple validation
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Setting values using setters
        s1.setName("Somveer");
        s1.setAge(20);

        // Getting values using getters
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
