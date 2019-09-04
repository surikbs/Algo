package algo.hashing;

import java.util.HashMap;

public class FindPairs {
    class pair{
        int first, second;
        pair(int f, int s){
            first = f; second = s;
        };
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 4, 7, 1, 2, 9, 8};
        FindPairs fp = new FindPairs();
        fp.findPairs(arr);
    }
    boolean findPairs(int[] arr){
        // Create an empty Hash to store mapping from sum to
        // pair indexes
        HashMap<Integer,pair> map = new HashMap<>();
        int n = arr.length;
        // traverse through all possible pairs of arr[]
        for ( int i = 0; i < n ; i ++){
            for (int j = i + 1; j < n ; ++j ){
                int sum = arr[i] + arr [j];
                // If sum of current pair is not in hash,
                // then store it and continue to next pair
                if (!map.containsKey(sum))
                    map.put(sum,new pair(i,j));
                else {
                    pair p = map.get(sum);
                    System.out.println("("+arr[p.first]+", "+arr[p.second]+") and ("+arr[i]+", "+arr[j]+")");
                    return true;
                }
            }
        }
        return false;
    }
}
