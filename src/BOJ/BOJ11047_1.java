package BOJ;

import java.util.Scanner;

public class BOJ11047_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();//동전종류
        int K = in.nextInt();//돈
        int[] coins = new int[N];

        for (int i = 0; i < N; i++) {
            coins[i] = in.nextInt();
        }

        int numCoins = 0;

        for (int i = N - 1; K > 0 && i >= 0; i--) {
            numCoins += K / coins[i];
            K = K % coins[i];
        }

        System.out.println(numCoins);
    }
}