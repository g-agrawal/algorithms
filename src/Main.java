import sort.MergeSort;
import sort.QuickSort;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("************");
//        int[] array = {8, 1, 3, 9, 5};
//        QuickSort sort = new QuickSort();
//        Arrays.stream(array).forEach(System.out::println);
//        sort.quickSort(array);
//        System.out.println("************");
//        Arrays.stream(array).forEach(System.out::println);
//        System.out.println("************");
        int[] array = {8, 1, 3, 9, 5};
        MergeSort sort = new MergeSort();
        sort.merge(array, 0, array.length - 1);

        Arrays.stream(array).forEach(System.out::println);
    }
}