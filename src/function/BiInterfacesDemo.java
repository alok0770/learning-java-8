package function;

import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.BiFunction;
import java.util.function.BiConsumer;

public class BiInterfacesDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number : true (even) false(odd) : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter your number : true (even) false(odd) : ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        BiPredicate<Integer, Integer> biPredicate = (a, b) -> (a + b) % 2 == 0;
        System.out.println(biPredicate.test(num1, num2));

        System.out.println("\nBiFunction ");
        BiFunction<Integer, Integer, Integer> addition = (a, b) -> a + b;
        System.out.println("Addition : " + addition.apply(num1, num2));

        System.out.println("\nBiConsumer ");

        System.out.print("Enter your name : ");
        String name = scanner.nextLine();

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        BiConsumer<String, Integer> printAge = (x, y) -> {
            System.out.println(x + " is " + y + " years old.");
        };
        System.out.println();
        printAge.accept(name , age);
        scanner.close();
    }
}
