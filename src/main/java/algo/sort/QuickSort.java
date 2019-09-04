package algo.sort;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 10,7,8,9,1,5};
        int n = arr.length;

        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr,0,n-1);
        System.out.println("Sorted Array: ");
        printArray(arr);
    }
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0 ; i < n ; i ++)
            System.out.println(arr[i]+ " ");
        System.out.println();
    }

    void sort(int arr[], int low, int high){
        if ( low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);
            // Recursively sort elements before
            // partition and after partition

            sort(arr, low, pi - 1);
            sort(arr,pi + 1, high);
        }
    }
/* This function takes the last element as pivot, places the pivot element at its correct position in sorted array
and places all smaller(smaller than pivot) to the left of pivot and all greater element to right of pivot
 */
    int partition( int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low - 1 );                 // index of the smaller element
        for ( int j = low; j < high; j++){
            if (arr[j] < pivot){            //if the current element is smaller than the pivot
                i++;
                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //swap arr[i+1] and arr[high] or pivot
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
