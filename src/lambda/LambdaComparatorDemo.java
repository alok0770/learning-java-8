package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(8);
        list.add(2);
        list.add(99);
        list.add(56);
        list.add(12);

        System.out.println("before sorting : " + list);

        Comparator<Integer> dsecOrder = (o1 , o2) -> (o2 - o1);
        list.sort(dsecOrder);
        System.out.println("After sorting : " + list);
    }
}




