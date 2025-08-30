package Inheritance.MultilineInheritance;
// Multilevel Inheritance Example

class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping.");
    }
}
public class MultiLineInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // grandparent class
        p.bark();  // parent class
        p.weep();  // child class
    }
}
