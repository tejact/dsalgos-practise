package sort;

import java.util.Arrays;

public class KthSmallest {
    //Use quick select
    public static void main(String[] args) {
        int arr[] = new int[]{6,2,9,1,3,4};
        System.out.println(quickSelect(arr,0,arr.length - 1,5));
    }

    // Time complexity : Worst Case: O(n^2) ,  Best Case: O(n)
    // Average case with random pivot : O(n)
    private static int quickSelect(int[] arr, int lo, int hi, int k) {
        if(lo < hi){
            int p = partition(arr,lo,hi);
            if(p + 1 == k){
                return arr[p];
            }else if (p + 1 < k){
                return quickSelect(arr,p + 1,hi,k);
            }else{
                return quickSelect(arr,lo,p - 1,k);
            }
        }
        return Integer.MAX_VALUE;
    }

    private static int partition(int[] arr, int lo, int hi) {
        System.out.println("Lo and hi are "+lo+" "+hi);
        int startOfHigh = lo;
        for(int i = lo; i < hi; i++){
            if(arr[i] < arr[hi]){
                // swap
                int temp = arr[i];
                arr[i] = arr[startOfHigh];
                arr[startOfHigh] = temp;
                startOfHigh++;
            }
        }
        int temp = arr[hi];
        arr[hi] = arr[startOfHigh];
        arr[startOfHigh] = temp;
        System.out.println("After partition "+ Arrays.toString(arr)+" "+startOfHigh);
        return startOfHigh;
    }


    //TODO: Implement quick select in iterative process
    //TODO: do the kth largest element in the array from Leetcode
    //TODO: Use random to make the average time complexity of O(n)

}
