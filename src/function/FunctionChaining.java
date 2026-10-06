package function;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {

        Function<Integer, Integer> function1 = x -> x * 2;
        Function<Integer, Integer> function2 = x -> x * x * x;

        System.out.println(function1.andThen(function2).apply(3));// 216
        System.out.println(function1.compose(function2).apply(3));// 54

    }
}
