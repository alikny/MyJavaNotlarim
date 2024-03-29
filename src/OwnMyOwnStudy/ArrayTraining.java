package OwnMyOwnStudy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayTraining {

    public static void main(String[] args) {
        int[] ar1 = new int[5];
        int[] x = {7,2,10,9};
        List<int[]> ints = List.of(x);
        System.out.println("ints = " + ints);
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("integers = " + integers);

        List<Integer> integers1 = IntStream.of(x).boxed().toList();
        List<Integer> collect = IntStream.of(x).boxed().collect(Collectors.toList());
        System.out.println("integers1 = " + integers1);
        System.out.println("collect = " + collect);


    }
}
