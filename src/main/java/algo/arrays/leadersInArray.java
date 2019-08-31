package algo.arrays;

public class leadersInArray {

    public static void main(String[] args) {
        leadersInArray leadersInArray = new leadersInArray();
        int[] arr = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        leadersInArray.printLeaders(arr,n);
    }

    //Time Complexity: O(n*n)
//    void printLeaders(int arr[], int size){
//        for (int i = 0; i < size; i ++){
//            int j;
//            for (j = i + 1; j < size ; j ++ ){
//                if (arr[i] <= arr[j])
//                    break;
//            }
//            if (j == size)
//                System.out.println(arr[i] + " ");
//        }
//    }
    //Time Complexity: O(n)

    private void printLeaders(int[] arr, int size){
        int max_from_right = arr[size - 1];
        System.out.println(max_from_right + " ");
        for (int i = size - 2; i >= 0; i--){
            if (max_from_right < arr[i]){
                max_from_right = arr[i];
                System.out.println(max_from_right + " ");
            }
        }
    }
}
