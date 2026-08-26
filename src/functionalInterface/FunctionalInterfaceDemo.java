package functionalInterface;

public class FunctionalInterfaceDemo implements MyInterface {

    public static void main(String[] args) {

        // Creating an object of the implementing class
        FunctionalInterfaceDemo interfaceDemo = new FunctionalInterfaceDemo();

        System.out.println("===== Functional Interface Demo =====");

        // Calling the implemented abstract method
        int result = interfaceDemo.calculation(1000, 7635);
        System.out.println("Addition Result : " + result);

        // Calling the default method
        interfaceDemo.print();

        // Calling the static method using the interface name
        MyInterface.use();

        System.out.println("=====================================");
    }

    // Providing implementation of the abstract method
    @Override
    public int calculation(int a, int b) {
        return a + b;
    }
}