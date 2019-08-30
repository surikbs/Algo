package algo;

public class findMajorityElement {
    private static final int NULL = 0;

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,5,3,2,1,1,2,1,2,3,4,44,5,4,5,6,4};
        int len = arr.length;
       findmajority(arr,len);
    }

    public static void findmajority(int[] num, int n ){
        int maxCount = 0;
        int index = -1;
        for (int i = 0 ; i < num.length; i ++){
            int count = 0;
            for ( int j = 0 ; j < num.length; j++){
                if ( num[i] == num[j])
                    count++;
            }
            if (count > maxCount){
                maxCount=count;
                index=i;
            }
        }
        if (maxCount < n/2){
            System.out.println( num[index]);
        } else {
            System.out.println("No Majority element");
        }
    }
}
