package AccessModifiers;
// Demonstration of Access Modifiers in Java
class Parent {
    public int pubVar = 10;        // Accessible everywhere
    private int priVar = 20;       // Accessible only inside this class
    protected int proVar = 30;     // Accessible inside same package + subclasses
    int defVar = 40;               // (Default) Accessible only in same package

    // Public method
    public void showPublic() {
        System.out.println("Public method: pubVar = " + pubVar);
    }

    // Private method
    private void showPrivate() {
        System.out.println("Private method: priVar = " + priVar);
    }

    // Protected method
    protected void showProtected() {
        System.out.println("Protected method: proVar = " + proVar);
    }

    // Default method
    void showDefault() {
        System.out.println("Default method: defVar = " + defVar);
    }

    // Method to access private (only accessible inside the same class)
    public void accessPrivateInsideClass() {
        showPrivate();
    }
}

// Subclass in same package
class Child extends Parent {
    public void display() {
        // Accessing parent variables
        System.out.println("Accessing in Child Class:");
        System.out.println("Public var: " + pubVar);    //  Accessible
        // System.out.println("Private var: " + priVar); //  Not accessible
        System.out.println("Protected var: " + proVar); //  Accessible
        System.out.println("Default var: " + defVar);   //  Accessible (same package)
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        // Public - Accessible
        p.showPublic();

        // Private -  Not Accessible outside Parent class
        // p.showPrivate();  // ERROR

        // Access private using a public method
        p.accessPrivateInsideClass();

        // Protected - Accessible inside same package
        p.showProtected();

        // Default - Accessible inside same package
        p.showDefault();

        // Access from Child
        c.display();
    }
}

