package algo.arrays;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class SubarraySum {
    public static void main(String[] args) {
        SubarraySum subarraySum = new SubarraySum();
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = arr[n - 1];
        subarraySum.SubArraySum(arr,n,sum);
    }

    //Time Complexity : O(n^2) in worst case.
//    int SubArraySum(int arr[], int size, int sum){
//        int curr_sum, i,j;
//        for(i=0; i < size; i ++) {
//            curr_sum = arr[i];
//            // try all subarrays starting with i
//            for (j = i; j <= size; j++) {
//                if (curr_sum == sum) {
//                    int p = j - 1;
//                    System.out.println("Sum found between the indexes " + i + " and " + p);
//                    return 1;
//                }
//                if (curr_sum > sum || j == size)
//                    break;
//                curr_sum = curr_sum + arr[j];
//            }
//        }
//        System.out.println("No Subarray");
//        return 0;
//    }

    //efficient

    private int SubArraySum(int[] arr, int size, int sum){
        int curr_sum = arr[0], start = 0, i;
        for (i=1;i<=size;i++){
            while (curr_sum > sum && start < i-1){
                curr_sum = curr_sum - arr[start];
                start ++;
            }
            if (curr_sum == sum){
                int p = i - 1;
                System.out.println("Sum found between the indexes " + start + " and " + p);
                return 1;
            }
            if (i< size) curr_sum = curr_sum + arr[i];
        }
        System.out.println("No Sub Array");
        return 0;
    }
}
