package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValid = false;

        while(!isValid) {
            try {
                System.out.print("Enter a number : ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter a number : ");
                double num2 = scanner.nextDouble();

                Operations add = (a, b) -> a + b;

                System.out.print("Addition is : " + add.operation(num1, num2));


                System.out.println();
                System.out.println("-------------------");
                Operations sub = (a, b) -> a - b;
                System.out.print("Subtraction is : " + sub.operation(num1, num2));

                System.out.println();
                System.out.println("----------------------");
                Operations div = (a, b) -> (b == 0) ? 0 : a / b;
                System.out.println("Division is : " + div.operation(num1, num2));

                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("! Invalid input ");

                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
