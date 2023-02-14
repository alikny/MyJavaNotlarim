package src.day49_upskills;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerFunctionalInterface {
    public static void main(String[] args) {
        Consumer<String> threeTiimes = s -> {
            System.out.println(s);
        };

        threeTiimes.accept("String---");

        Consumer<List> printEach = list -> {
            for (Object o : list) {
                System.out.println("o = " + o);
            }
        };

        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 10, 10, 20, 10, 30, 40, 20, 30, 50, 60, 80, 20, 10, 30));
        printEach.accept(nums);

        Consumer<Integer> yapBisey = i -> {
            System.out.print(i + "+");
        };

        nums.forEach(yapBisey);

        System.out.println("--------------");

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(10, 10, 10, 20, 10, 30, 40,40,40, 20, 30, 50, 60, 80, 20, 10, 30));
        Predicate<Integer> isDuplicated = i -> Collections.frequency(nums2, i) > 1;
        List<Integer> duplicatedOnes = new ArrayList<>();

        nums.forEach(each -> {
            if (isDuplicated.test(each)) {
                if (!duplicatedOnes.contains(each)) {
                    duplicatedOnes.add(each);
                }
            }
        });
        System.out.println("duplicatedOnes = " + duplicatedOnes);


    }

}
