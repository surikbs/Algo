package algo;

import java.util.HashMap;

public class findMajorityElement {
    private static final int NULL = 0;

    public static void main(String[] args) {
        int[] arr = {4,4,5,5,5,5,5,5,1,1,1};
        int len = arr.length;
      // findMajorityElement.findmajority(arr,len);
        findMajority(arr);
    }

//    public static void findmajority(int[] num, int n ){
//        int maxCount = 0;
//        int index = -1;
//        for (int i = 0 ; i < num.length; i ++){
//            int count = 0;
//            for ( int j = 0 ; j < num.length; j++){
//                if ( num[i] == num[j])
//                    count++;
//            }
//            if (count > maxCount){
//                maxCount=count;
//                index=i;
//            }
//        }
//        if (maxCount < n/2){
//            System.out.println( num[index]);
//        } else {
//            System.out.println("No Majority element");
//        }
//    }

    // METHOD 2: Binary Search Tree - Time Complexity : O(n*n)
    // Using Self Balancing Binary Search Tree - Time Complexity : O(n log n)

    // METHOD 3: Using Moore's Voting Algorithm
    //1. The first step gives the element that may be majority element in the array. If there is a majority element in an array,
    //   then this step will definitely return majority element, otherwise it will return candidate for majority element.
    //2. Check if the element obtained from above step is majority element. This step is necessary as we are not always sure that
    //   element return by first step is majority element.
//    Time Complexity: O(n)
//    Auxiliary Space : O(1)

//    private static void findmajority(int a[], int size) {
//        int cand = findCandidate(a,size);
//        if (isMajority(a,size,cand))
//            System.out.println(" " + cand + " ");
//            else
//            System.out.println("No Majority Candidate");
//    }
//    private static int findCandidate(int a[], int size){
//        int max_index = 0, count = 1, i;
//        for (i=1; i < size; i ++){
//            if (a[max_index] == a[i])
//                count++;
//            else
//                count--;
//            if (count == 0){
//                max_index = i;
//                count = 1;
//            }
//        }
//        return a[max_index];
//    }
//    private static boolean isMajority(int a[], int size, int cand){
//        int i , count = 0;
//        for ( i = 0; i < size; i ++){
//            if (a[i] == cand)
//                count++;
//        } return count> size/2;
//    }

//    METHOD 4 (Using Hashmap) :This method is somewhat similar to Moore voting algorithm in terms of time complexity, but in this case there is no need of second step of Moore voting algorithm.But as usual, here space complexity becomes O(n).
//    In Hashmap(key-value pair), at value,maintain a count for each element(key) and whenever count is greater than half of array length, we are just returning that key(majority element).
//
//    Time Complexity : O(n)
//    Auxiliary Space : O(n)

        private static void findMajority(int[] arr){
            HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < arr.length; i++){
                if(map.containsKey(arr[i])){
                    int count = map.get(arr[i]) + 1;
                    if (count > arr.length/2){
                        System.out.println("Majority Found :- " + arr[i]);
                        return;
                    } else
                        map.put(arr[i],count);
                }
                else
                    map.put(arr[i],1);
            }
            System.out.println("No Majority element");
        }
}
