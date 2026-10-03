package lambda;


import java.util.ArrayList;
import java.util.Collections;

public class LambdaComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(8);
        list.add(2);
        list.add(99);
        list.add(56);
        list.add(12);

        Collections.sort(list);
        System.out.println(list);

    }
}
