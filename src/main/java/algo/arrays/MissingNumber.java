package algo.arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr1 = {7,6,3,1,8,5,4,9,2,11};
        System.out.println("Missing Number in array:"+ missingNumber(arr1));
        int[] arr2 = {9,1,2,3,5,4,8,6};
        System.out.println("Missing Number in the array:"+ missingNumber(arr2));
    }

// Traditional Approach
    private static int missingNumber(int[] num){
        int n=num.length+1;
        int sum=n*(n+1)/2;
        System.out.println(sum);
        int restsum=0;
        for (int value : num) {
            restsum += value;
        }
        return sum-restsum;
    }
//
// The below logic works only if the numbers are in ascending order in the array
// 1. Get the sum of numbers which is total = n*(n+1)/2
// 2. Subtract all the numbers from sum and you will get the missing number

//    public static int missingNumber(int[] num){
//        int i, total, n = num.length;
//        total = (n+1) * (n+2)/2;
//        for ( i = 0 ; i < n; i ++)
//            total-=num[i];
//        return total;
//    }

//  1) XOR all the array elements, let the result of XOR be X1.
//  2) XOR all numbers from 1 to n, let XOR be X2.
//  3) XOR of X1 and X2 gives the missing number.

//    public static int missingNumber(int[] num){
//        int n = num.length;
//        int i;
//        int x1 = num[0];
//        int x2 = 1;
//        System.out.println(n);
//        // XOR all the elements
//        for (i =0;  i < n ; i ++ )
//            x1 = x1^num[i];
//
//        // XOR of all the numbers 1 to n
//        for ( i = 2; i < n ; i ++ )
//            x2 = x2^i;
//        return (x1^x2);
//    }

}
