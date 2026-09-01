package lambda;

public class LambdaDemo {
    public static void main(String[] args) {

        Employee employee = () ->"Alok";
        System.out.println("Employee : " + employee.getName());

        Employee  editor = () -> "Rahul";

        System.out.println("Editor : " + editor.getName());
        }
    }


