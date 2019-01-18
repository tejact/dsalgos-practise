package sort;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{3,4,50,60};
        // Element exist in the array
        System.out.println(binarySearch(arr,3,0,arr.length-1));
        System.out.println(binarySearch(arr,4,0,arr.length-1));
        System.out.println(binarySearch(arr,50,0,arr.length-1));
        System.out.println(binarySearch(arr,60,0,arr.length-1));
        // Elements does not exist in the arrays
        System.out.println(binarySearch(arr,1,0,arr.length-1));
        System.out.println(binarySearch(arr,100,0,arr.length-1));
    }
    // sorted array is passed
    // Time Complexity : O(logn)
    private static int binarySearch(int[] arr, int s, int lo, int hi) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            System.out.println(lo + " " + mid + " " + hi);
            if (arr[mid] == s) {
                return mid;
            } else if (arr[mid] < s) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
}
