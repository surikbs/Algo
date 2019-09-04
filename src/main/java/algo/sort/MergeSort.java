package algo.sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Given Array: ");
        printArray(arr);

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr,0,arr.length-1);
        System.out.println("Sorted Array: ");

        printArray(arr);

    }
    private static void printArray(int[] arr){
        int n = arr.length;
        System.out.println();
        for (int value : arr) {
            System.out.println(value + " ");
        }
    }

    private void sort(int[] arr, int low, int high){
        if ( low < high){
            int mid = ( low + high )/2;
            sort(arr, low, mid);
            sort(arr, mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    private void merge(int[] arr, int l, int m, int r)
    {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 =  r - m;

        /* create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /* Copy data to temp arrays L[] and R[] */
        for (i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[m + 1+ j];

        /* Merge the temp arrays back into arr[l..r]*/
        i = 0; // Initial index of first subarray
        j = 0; // Initial index of second subarray
        k = l; // Initial index of merged subarray
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

    /* Copy the remaining elements of L[], if there
       are any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

    /* Copy the remaining elements of R[], if there
       are any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
