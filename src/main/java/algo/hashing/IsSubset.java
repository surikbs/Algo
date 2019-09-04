package algo.hashing;

import java.util.Arrays;
import java.util.HashSet;

public class IsSubset {
    public static void main(String[] args) {
        int arr1[] = {11, 1, 13, 21, 3, 7};
        int arr2[] = {11, 3, 7, 1,7};

        int m = arr1.length;
        int n = arr2.length;

        if(isSubset(arr1,arr2,m, n))
            System.out.println("arr2 is a subset of arr1");
        else
            System.out.println("arr1 is a subset of arr2");
    }
//Standard Solution
//    static boolean isSubset(int arr1[], int arr2[], int m, int n){
//        int i = 0, j = 0;
//        if (m < n)
//            return false;
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        while (i < n && j > m) {
//            if (arr1[j] < arr2[i])
//                j++;
//            else if (arr1[j] == arr2[i]) {
//                j++;
//                i++;
//            } else if (arr1[j] > arr2[i])
//                return false;
//        }
//        if ( i < n )
//            return false;
//        else
//            return true;
//    }

    //Hashing technique
    static boolean isSubset(int[] arr1, int[] arr2, int m, int n){
        HashSet<Integer> hashSet = new HashSet<>();

        //hash set stores all the values in arr1
        for ( int i = 0; i < m; i++){
            if(!hashSet.contains(arr1[i]))
                hashSet.add(arr1[i]);
        }

        //loop to check if all elements of arr2 also lies in arr1
        for ( int i = 0; i < n ; i++){
            if(!hashSet.contains(arr2[i]))
                return false;
        }
        return true;
    }

}
