package This;
class Student {
    String name;
    int age;
    String course;

    // 1st Constructor
    Student() {
        this("Unknown", 18);  // ek aur constructor call
        System.out.println("Default constructor called");
    }

    // 2nd Constructor
    Student(String name, int age) {
        this(name, age, "Not Assigned");  // teesra constructor call
        System.out.println("Constructor with 2 parameters called");
    }

    // 3rd Constructor
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Constructor with 3 parameters called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

public class This {
    public static void main(String[] args) {
        Student s1 = new Student();                 // Default call
        Student s2 = new Student("Somveer", 19);    // 2 parameters
        Student s3 = new Student("Aman", 20, "CSE"); // 3 parameters

        s1.display();
        s2.display();
        s3.display();
    }
}
