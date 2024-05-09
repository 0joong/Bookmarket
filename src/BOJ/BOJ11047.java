package BOJ;

import java.util.Scanner;

public class BOJ11047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//동전의 종류
        int k = scanner.nextInt();//동전으로 만들 돈
        int coin[] = new int[n];
        int result = 0;

        for (int i = 0; i < n; i++)
            coin[i] = scanner.nextInt();

        for (int i = 0; i < coin.length; i++) {
            while (k >= coin[coin.length - 1 - i]) {
                k -= coin[coin.length - 1 - i];
                result++;
            }
        }
        System.out.println(result);
    }
}
