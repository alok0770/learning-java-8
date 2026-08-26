package functionalInterface;

@FunctionalInterface
public interface Child extends Parent {

    // Default method
    default void showParent() {
        System.out.println("Parent Information : Parent method called.");
    }

    // Static method
    static void childName() {
        System.out.println("Child Information : Static method called.");
    }
}