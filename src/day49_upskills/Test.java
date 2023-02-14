package src.day49_upskills;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {

        DataFuntion<Integer> functions = (Integer i, Integer k) -> i * k;

        System.out.println("functions.myfuntion(3,5) = " + functions.myfuntion(3, 5));


        System.out.println("++++++++++++++++++++++++++");

        Predicate<Integer> isEvenNumber = e -> {
            if (e % 2 == 0)
                return true;
            return false;
        };
        isEvenNumber.test(5);

        System.out.println("isEvenNumber.test(4) = " + isEvenNumber.test(4));

        List<Integer> list = new ArrayList<>(Arrays.asList(30, 50, 60, 70, 9, 90));
        List<String> list2 = new ArrayList<>(Arrays.asList("A", "AA","AA", "BB"));
        System.out.println("list.stream().allMatch(isEvenNumber) = " + list.stream().allMatch(isEvenNumber));

        Predicate<String> isUnique = s -> Collections.frequency(list2, s) == 1;
        System.out.println("isUnique.test(\"a\") = " + isUnique.test("a"));
        System.out.println("isUnique.test(\"A\") = " + isUnique.test("A"));

        System.out.println("list2.stream().allMatch(isUnique) = " + list2.stream().allMatch(isUnique));

        for (String s : list2) {
            System.out.println("isUnique.test(s) = " + isUnique.test(s));
        }


        System.out.println("=====================");
        List<Integer> nums =new ArrayList<>(Arrays.asList(10,10,10,20,10,30,40,20,30, 50,60,80,20,10,30));

        Predicate<Integer> isSmaller = n -> n<40;

        nums.removeIf(isSmaller);
        System.out.println("nums = " + nums);

    }

}
