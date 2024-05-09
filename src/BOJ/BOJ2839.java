package BOJ;

import java.util.Scanner;

public class BOJ2839 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int plasticBag = -1;

        for(int i = 0 ; i<=n ; i++){
            for(int j = 0 ; j <= n; j++){
                if(i*5 + j*3==n){
                    plasticBag = i+j;
                }
            }
        }
        System.out.println(plasticBag);
    }
}
