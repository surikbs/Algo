package algo.search;

public class binarySearch {
    public static void main(String[] args) {
        binarySearch binarySearch = new binarySearch();
        int[] arr = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = binarySearch.BinarySearch(arr,0,n-1,x);
        if ( result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }

    private int BinarySearch(int[] arr, int low, int size, int num){
        if (size>=1){
            int mid = low + (size-1)/2;
            if(arr[mid] == num)
                return mid;
            if (arr[mid] > num)
                return BinarySearch(arr,low,mid-1,num);
            return BinarySearch(arr,mid+1,size,num);
        }
        return -1;
    }
}
