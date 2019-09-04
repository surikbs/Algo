package algo.hashing;

import java.util.Arrays;

// Java program to check if given array
// has 2 elements whose sum is equal
// to the given value
public class hasArrayTwoCandidates {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, -8 };
        int sum = 16;
        int size = arr.length;

        if(hasarraytwocandidates(arr,size,sum))
            System.out.println("Array has two elements with given sum");
        else
            System.out.println("Array doesn't have two elements with the given sum");
    }

    private static boolean hasarraytwocandidates(int[] arr, int size, int sum) {
        int low, high;
        Arrays.sort(arr);
        low = 0;
        high = arr.length - 1;
        while (low < high){
            if (arr[low] + arr[high] == sum) {
                System.out.println(arr[low] + " " + arr[high]);
                return true;
            }
            else if (arr[low] + arr[high] < sum)
                low++;
            else
                high--;
        }
        return false;
    }
}
