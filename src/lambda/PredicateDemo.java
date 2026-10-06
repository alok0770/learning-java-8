package lambda;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Static Condition Test: Check if number is even

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 23 Even -> " + isEven.test(23));

        // 2. Static Condition Test: Check salary threshold

        Predicate<Integer> salaryGreaterThanOneLac = salary -> salary > 100000;
        System.out.println(salaryGreaterThanOneLac.test(250000));
        System.out.println();

        // 3. Dynamic Test: Evaluate user input marks

        System.out.print("Enter your marks -> ");
        int marks = scanner.nextInt();

        // Pass condition (> 50)

        Predicate<Integer> isPassingMarks = num -> num > 50;
        System.out.println("Your marks is : " + marks + " \nAre you pass : " + isPassingMarks.test(marks));

        scanner.close();
    }
}