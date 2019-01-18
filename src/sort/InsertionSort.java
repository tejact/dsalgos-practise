package sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Bubble Sort Test Cases");
        printTest(new int[]{9,6,12,1,2,10});
        printTest(new int[]{1,2,3,4,5});
        printTest(new int[]{5,4,3,2,1});
        printTest(new int[]{1,1,1,1});
        printTest(new int[]{1,2});
        printTest(new int[]{2,1});
        printTest(new int[]{1});
        printTest(new int[]{});
        printTest(null);
    }

    private static void printTest(int[] list) {
        System.out.println("\n"+ Arrays.toString(list));
        insertionSort(list);
        System.out.println(Arrays.toString(list));
        insertionSort_differentIndexing(list);
        System.out.println(Arrays.toString(list));
    }

    private static void insertionSort(int[] list) {
        if(list == null){
            return;
        }
        // First element is already sorted.
        // so the loop starts at 1.
        for(int i = 1; i < list.length; i++){
            // save the current element
            int current = list[i];
            int j;
            // do not consider already sorted arrays
            // this loop in reverse order. Start at j and go till start of the array
            // Stopped at 1. This will be the last comparision
            for(j = i; j > 0 && current < list[j-1]; j--){
                list[j] = list[j-1];
            }
            list[j] = current;
        }
    }

    private static void insertionSort_differentIndexing(int[] list) {
        if(list == null){
            return;
        }
        // First element is already sorted.
        // so the loop starts at 1.
        for(int i = 1; i < list.length; i++){
            // save the current element
            int current = list[i];
            int j;
            // do not consider already sorted arrays
            for(j = i - 1; j >= 0 && current < list[j]; j--){
                list[j + 1] = list[j];
            }
            list[j + 1] = current;
        }
    }
}
