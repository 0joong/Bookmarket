package BOJ;

import java.util.Scanner;

public class BOJ2839 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bag = -1;

        for(int i = 0 ; i<=n ; i++)
            for(int j = 1 ; j <=n; j++)
                if(i*5 + j*3==n)
                   bag = i+j;
        System.out.println(bag);
    }
}
