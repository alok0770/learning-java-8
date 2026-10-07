package function;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        //Unary Example

        boolean correct = false;
        while (!correct) {
            try {
                System.out.print("Enter a number : ");
                num1 = scanner.nextInt();

                System.out.print("Enter a number : ");
                num2 = scanner.nextInt();

                UnaryOperator<Integer> square = x -> x * x;
                System.out.println("Square of " + num1 + " : " + square.apply(num1));


                BinaryOperator<Integer> binary = (a, b) -> a * a * b * b;
                System.out.println(binary.apply(num1, num2));
                correct = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input !! ");
                scanner.nextLine();

            }

        }
        scanner.close();
    }
}
