package algo.sort;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort.bubblesort(arr);
        System.out.println("Sorted Array");
        bubbleSort.printArray(arr);
    }
    /// O(n^2)

//    void bubblesort(int arr[]){
//        int n = arr.length;
//        for (int i = 0; i < n - 1 ; i ++)
//            for (int j = 0;j < n - i - 1; j++ )
//                if (arr[j] > arr[j + 1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//    }

    //Optimized Bubble Sort
    private void bubblesort(int[] arr){
        int n = arr.length,temp;
        boolean swapped;
        for (int i = 0 ; i < n - 1; i ++){
            swapped = false;
            for(int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
    }
    private void printArray(int[] arr){
        int n = arr.length;
        for (int value : arr) System.out.println(value + " ");
        System.out.println();
    }

}
