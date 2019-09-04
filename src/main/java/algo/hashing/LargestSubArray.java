package algo.hashing;


//Largest subarray with equal number of 0s and 1s

public class LargestSubArray {
    public static void main(String[] args) {
        LargestSubArray subArray = new LargestSubArray();
        int[] arr = {1, 0, 0,1,1,1,0, 1, 1, 1};
        int size = arr.length;

        subArray.findSubArray(arr, size);
    }
    int findSubArray( int arr[], int size){
        int sum = 0, maxsize = -1, startindex = 0, endindex = 0;
        //picking a starting point as i

        for ( int i = 0; i < size - 1; i++){
            sum = (arr[i] == 0)? -1 : 1;
            for (int j = i + 1; j < size; j++){
                if(arr[j] == 0)
                    sum += -1;
                else
                    sum += 1;

                if (sum == 0 && maxsize < j - i + 1){
                    maxsize = j - i + 1;
                    startindex = i;
                }
            }
        }
        endindex = startindex + maxsize - 1;
        if( maxsize == -1)
            System.out.println("No Such subArray");
        else
            System.out.println(startindex + " to " + endindex);
        return maxsize;
    }
}
