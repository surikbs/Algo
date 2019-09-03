package algo.amazon;

public class nextGreatest {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        nextgreatest(arr);
        System.out.println("THe Modified array: ");
        printArray(arr);
    }
    private static void printArray(int[] arr) {
        for (int value : arr) System.out.println(value + " ");
    }
    private static void nextgreatest(int[] arr) {
        int size = arr.length;
        int max_from_right = arr[size-1];  // Initialize the next greatest element
        arr[size-1] = -1; // the next greatest element for the rightmost element is always -1

        for(int i = size - 2; i >= 0; i--){ // replace all other elements with the next greatest
            int temp = arr[i];              //store the current element(needed later for updating the next greatest element
            arr[i] = max_from_right;        // replace current element with the next greatest
            if (max_from_right < temp)      //update the greatest element, if needed
                max_from_right = temp;
        }
    }

}
