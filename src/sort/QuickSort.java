package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 9, 10, 12, 1, 4, 6};
        partition_algorithmDesignManual(arr, 0, arr.length - 1);
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[]a,int lo,int hi){
        if(lo < hi){
            int p = partition_algorithmDesignManual(a,lo,hi);
            quickSort(a,lo,p-1);
            quickSort(a,p+1,hi);
        }
    }

    private static int partition_algorithmDesignManual(int[] a, int lo, int hi){
        int pivot = hi;
        int firstHigh = lo;
        for(int i = lo; i < hi; i++){
            if(a[i] < a[pivot]){
                // swap
                swap(a,i,firstHigh);
                firstHigh++;
            }
        }
        // swap pivot
        swap(a,pivot,firstHigh);
        return firstHigh;
    }

    //TODO: Implement this method.
    //http://www.inf.fh-flensburg.de/lang/algorithmen/sortieren/quick/quicken.htm
    private static int partition_alogirthmsAndMe(int[] a,int lo,int hi){
        return 0;
    }

    private static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
