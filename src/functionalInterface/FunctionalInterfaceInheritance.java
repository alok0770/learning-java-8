package functionalInterface;

public class FunctionalInterfaceInheritance implements Child {

    public static void main(String[] args) {

        // Creating an object of the implementing class
        FunctionalInterfaceInheritance inheritance =
                new FunctionalInterfaceInheritance();

        // Calling the inherited abstract method
        inheritance.showName();

        // Calling the default method from Child interface
        inheritance.showParent();

        // Calling the static method using the interface name
        Child.childName();
    }

    // Providing implementation of the inherited abstract method
    @Override
    public void showName() {

        String name = "Alok";

        System.out.println("Name : " + name);
    }
}