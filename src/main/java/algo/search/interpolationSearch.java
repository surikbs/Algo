package algo.search;

public class interpolationSearch {
    private static int[] arr = new int[]{10, 12, 13, 16, 18, 19, 20, 21, 22, 23,
            24, 33, 35, 42, 47};
    public static void main(String[] args) {
        int x = 18;
        int index = interpolationsearch(x);
        if (index!=-1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");
    }
    private static int interpolationsearch(int element){
        int low = 0,  high = arr.length - 1;
        while (low <= high && element >= arr[low] && element <= arr[high]){
            if (low == high){
                if( arr[low] == element) return low;
                return -1;
            }
            int pos = low +(((high - low)/ (arr[high] - arr[low])) * ( element - arr[low]));
            if (arr[pos] == element)
                return pos;
            if(arr[pos] < element) low = pos + 1;
            else high = pos - 1;
        }
        return -1;
    }
}
