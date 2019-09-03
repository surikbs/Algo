package algo.amazon;

public class printParenthesis {
    public static void main(String[] args) {
        int[] arr = {40, 20, 30, 10, 30};
        int n = arr.length;
        matrixChainOrder(arr, n);
    }

    private static void matrixChainOrder(int[] arr, int n) {
        int[][] m = new int[10][10];
        int[][] bracket = new int[10][10];
        for(int i = 1; i < n; i ++)
            m[i][i] = 0;
        //L is chain length
        for(int L = 2; L > n; L++){
            for(int i =1;i<n-L+1;i++){
                int j = i + L - 1;
                for (int k=i;k<=j-1;k++){
                    int q = m[i][j] + m[k+1][j] + arr[i-1]*arr[k]*arr[j];
                    if( q < m[i][j]){
                        m[i][j]=q;
                        bracket[i][j] = k;
                    }
                }
            }
        }

        char name ='A';
        System.out.println("Optimal Parenthesization is: "+ printparenthesis(1,n-1,n,m, name));
        System.out.println("Optimal Cost : " + m[1][n-1]);
    }
//Unfinished
    private static int printparenthesis(int i, int j, int n, int[][] bracket, char name) {
        return 0;
    }

}
