package algo.sort;

public class CloseSum {
    public static void main(String[] args) {
        int[] arr = {10, 22, 28, 29, 30, 40};
        int x = 54;
        int n = arr.length;
        printClosest(arr, n, x);
    }
    private static void printClosest(int[] arr, int n, int x){
        int res_l=0, res_r=0;
        int low = 0, high = n - 1, diff = Integer.MAX_VALUE;

        while (high > low){
            if(Math.abs(arr[low] + arr[high] - x) < diff){
                res_l = 1;
                res_r = high;
                diff = Math.abs(arr[low] + arr[high] - x);
            }
            if ( arr[low] + arr[high] > x)
                high--;
            else
                low++;
        }
        System.out.println("The Closest pair is " + arr[res_l] + " and " + arr[res_r]);
    }
}
