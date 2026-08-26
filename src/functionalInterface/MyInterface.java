package functionalInterface;

@FunctionalInterface
public interface MyInterface {

    // Single abstract method
    int calculation(int a, int b);

    // Default method
    default void print() {
        System.out.println("Default Method : Addition operation completed.");
    }

    // Static method
    static void use() {
        System.out.println("Static Method  : Thank you for using the calculator.");
    }
}