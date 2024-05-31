package BOJ;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class 블랙잭 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] cardList = new int[N];

        for (int i = 0; i < N; i++) {
            cardList[i] = in.nextInt();
        }

        System.out.println(maxSumSearch(M, cardList, N));
    }

    static int maxSumSearch(int M, int[] numArr, int N) {
        int maxSum = 0;
        for (int a = 0; a < N - 2; a++) {
            for (int b = a +1; b < N - 1; b++) {
                for (int c = b + 1; c < N; c++) {
                    int sum = numArr[a] + numArr[b] + numArr[c];
                    if (sum == M) return sum;
                    if (sum < M && sum > maxSum)
                        maxSum = sum;
                }
            }
        }
        return maxSum;
    }

}
