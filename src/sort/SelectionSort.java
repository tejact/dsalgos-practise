package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Selection Sort Test Cases");
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
        System.out.println("\n"+Arrays.toString(list));
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void selectionSort(int[] list){
        if(list == null){
            return;
        }
        // Remember: Innter loop is doing all the heavy lifting.
        // Outer loop is just increasing the index by one and initializing it.
        // Time complexity is O(n ^ 2)
        for(int i = 0; i < list.length; i++){
            int currentMinIndex = i;
            for(int j = i ; j < list.length; j++){
                if(list[j] < list[currentMinIndex]){
                    currentMinIndex = j;
                }
            }
            //swap firstOfUnsorted with j
            int temp = list[i];
            list[i] = list[currentMinIndex];
            list[currentMinIndex] = temp;
        }

    }
}
