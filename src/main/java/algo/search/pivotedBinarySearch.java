package algo.search;

public class pivotedBinarySearch {
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int n = arr.length;
        int key = 2;
        System.out.println("Index of the element is: " + pivotedBinarySearch(arr,n,key));
    }
    static int findpivot(int arr[],int low, int high){
        if (high < low) return -1;
        if( high == low) return low;

        int mid = (high + low)/2;

        if ( mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if ( mid > low && arr[mid] < arr[mid - 1])
            return (mid - 1);

        if ( arr[low] >= arr[mid])
            return findpivot(arr,low,mid-1);
        return findpivot(arr,mid+1,high);
    }
    static int binarySearch(int arr[],int low, int high, int key){
        if ( high < low) return -1;
        int mid = (low + high)/2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid]) return binarySearch(arr,(mid + 1), high,key);
        return binarySearch(arr,low,(mid-1), key);
    }
    static int pivotedBinarySearch( int arr[], int n, int key){
        int pivot = findpivot(arr,0,n - 1);
        if(pivot == -1)                                         //If we dint find pivot, then array is not rotated at all
            return binarySearch(arr,0,n - 1,key);
        if(arr[pivot] == key)                                   //if we found a pivot, then first compare with pivot and then search in two subarrays around pivot
            return pivot;
        if(arr[0] <=key )
            return binarySearch(arr,0,pivot - 1,key);
        return binarySearch(arr,pivot + 1,n - 1,key);
    }
}
