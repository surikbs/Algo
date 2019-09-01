package algo.search;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 7, 5 };
        int n = arr.length;
        int x = 7;

        int index = search(arr,n,x);
        if (index == -1 )
            System.out.println("Element not in the array");
        else
            System.out.println("Element found at the position " + index);
    }
    private static int search(int[] arr, int size, int x) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

}
