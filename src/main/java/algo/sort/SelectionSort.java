package algo.sort;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {64,25,12,22,11};
        SelectionSort.selctionsort(arr);
        System.out.println("Sorted Array");
        selectionSort.printArray(arr);
    }

    private static void selctionsort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size-1;i++){
            int min_idx = i;
            for (int j = i+1; j < size; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    private void printArray(int[] arr){
        int n = arr.length;
        for (int value : arr) System.out.println(value + " ");
        System.out.println();
    }
}
