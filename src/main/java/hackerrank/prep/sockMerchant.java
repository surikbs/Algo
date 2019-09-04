package hackerrank.prep;

import java.util.Arrays;
import java.util.Scanner;
//Not Working went into infinite loop

public class sockMerchant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.next());
        int c[] = {10,20,10,20,30,30,40};

        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        Arrays.sort(c);
        int total = 0;
        for (int i = 0; i < n - 1; i++){
            if (i < n && c[i] == c[i+1]){
                total ++;
                i = i + 1;
            }
        }
        System.out.println("Print "+ total);
    }
}
