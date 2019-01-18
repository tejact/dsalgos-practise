package sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("Merge Sort Test Cases");
        printTest(new int[]{9,6,12,1,2,10});
        printTest(new int[]{1,2,3,4,5});
        printTest(new int[]{5,4,3,2,1});
        printTest(new int[]{1,1,1,1});
        printTest(new int[]{1,2});
        printTest(new int[]{2,1});
        printTest(new int[]{1});
        printTest(new int[]{});
    }

    private static void mergeSort(int[] arr, int lo, int hi){
        if(lo < hi){
            int mid = lo + (hi - lo) / 2;
            mergeSort(arr,lo,mid);
            mergeSort(arr,mid+1,hi);
            merge(arr,lo,mid,hi);
        }
    }

    private static void merge(int[] arr, int lo, int mid,int hi) {
        //Length of temp array is important here.
        int[] temp = new int[hi - lo + 1];
        int i = lo;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= hi){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= hi){
            temp[k++] = arr[j++];
        }
        // Copy temp array to a array
        k = 0;
        for(i = lo ; i <= hi; i++,k++){
            arr[i] = temp[k];
        }
    }

    private static void printTest(int[] list) {
        System.out.println("\n"+ Arrays.toString(list));
        mergeSort(list,0,list.length - 1);
        System.out.println(Arrays.toString(list));
    }
}
