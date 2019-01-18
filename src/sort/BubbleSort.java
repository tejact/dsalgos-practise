package sort;

import java.util.Arrays;

public class BubbleSort {
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

    private static void printTest(int[] test1) {
        System.out.println("\n"+ Arrays.toString(test1));
        bubbleSort(test1);
        System.out.println(Arrays.toString(test1));
    }

    private static void bubbleSort(int[] list) {
        if(list == null) {
            return;
        }
        // Remember: Similar to selection sort, heavy lifting is done in the inner loop
        // Here outer loop is says execute this for length number of times.
        // Time complexity is o(n^2)
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length - 1 - i; j++){
                if(list[j] < list[j+1]){
                    //swap
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }

}
