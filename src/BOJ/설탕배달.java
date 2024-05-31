package BOJ;

import java.util.Scanner;

public class 설탕배달 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int count = 0;

        while (N > 0) {
            if (N % 5 == 0) {
                count += N/5;
                N = 0;
            } else if  (N < 3) {
                N = 0;
                count = -1;
            } else{
                count++;
                N -= 3;
            }
        }
        System.out.println(count);
    }
}

