package function;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
public class ConsumerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scanner.nextLine();

        Consumer<String> greeting = x -> System.out.println("Hello " + x);
        greeting.accept(name);

        Consumer<Integer> printAdd100 = i -> System.out.println(i + 100);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        numbers.forEach(printAdd100);

        // Chaining

        Consumer<String> printOriginal = x -> System.out.println("Original : " + x);
        Consumer<String> printUpper = x -> System.out.println("UpperCase : " + x.toUpperCase());
        Consumer<String> printLength = x -> System.out.println("length : " + x.length());

        //.andThen function
       printOriginal.andThen(printUpper).andThen(printLength).accept(name);

        scanner.close();
    }
}
