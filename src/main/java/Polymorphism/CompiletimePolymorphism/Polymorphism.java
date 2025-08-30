package Polymorphism.CompiletimePolymorphism;
// Method Overloading Example

class MathOperation {
    // add method with 2 parameters
    int add(int a, int b) {
        return a + b;
    }

    // add method with 3 parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        System.out.println(m.add(5, 10));      // calls 2-parameter method
        System.out.println(m.add(5, 10, 15));  // calls 3-parameter method
    }
}
