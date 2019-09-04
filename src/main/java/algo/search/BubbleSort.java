package algo.search;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort.Bubblesort(arr);
        System.out.println("Sorted Array: ");
        bubbleSort.printArray(arr);
    }
    void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n;i++)
            System.out.println(arr[i]+ " ");
        System.out.println();
    }
//    void Bubblesort(int arr[]){
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++ )
//            for (int j =0 ; j < n - i -1; j ++)
//                if (arr[j] > arr[j+1]){
//                    //swap
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[ j + 1 ] = temp;
//                }
//    }

    //Optimized bubble sort

    static void Bubblesort( int arr[]){
        int n = arr.length, i, j, temp;
        boolean swapped;
        for ( i = 0; i < n - 1; i++){
            swapped = false;
            for ( j = 0; j < n - i - 1; j++ ){
                if (arr[j] > arr[j + 1])
                {
                    //swap
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if ( swapped == false)
                break;
        }
    }
}
