package BOJ;

import java.util.Scanner;

public class BOJ2798_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] cardList = new int[N];

        for (int i = 0; i < N; i++) {
            cardList[i] = scanner.nextInt();
        }

        System.out.println(searchMaxSum(M, N, cardList));

    }

    static int searchMaxSum(int M, int N, int[] cardList) {
        int maxSum = 0;

        for (int i = 0; i < N-2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cardList[i] + cardList[j] + cardList[k];
                    if (sum < M && sum > maxSum) maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}
