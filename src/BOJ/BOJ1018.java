package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int count2 = 0;
        int countarr[] = new int[50];
        int countarrcount = 0;
        int min = 0;
        String table = "BWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWB";
        String table2 = "WBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBW";
        String extraction = "";
        int n = scanner.nextInt();//몇줄?
        int m = scanner.nextInt();//한줄당 길이
        char mn[][] = new char[n][m];//체스판
        String temp[] = new String[n];

        for (int i = 0; i < n; i++) {
            temp[i] = scanner.next();
        }

        for (int a = 0; a < n - 8; a++) {
            for (int b = 0; b < m - 8; b++) {

                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        mn[i+a][j+b] = temp[i].charAt(j);
                    }
                }
                //System.out.println(Arrays.deepToString(mn));

                for (int i = 0; i < 8; i++) {// i<m-8
                    for (int j = 0; j < 8; j++) {//i<n-8
                        extraction = extraction.concat(String.valueOf(mn[i][j]));
                    }
                }
                for (int i = 0; i < 64; i++) {
                    if (extraction.charAt(i) != table.charAt(i)) {
                        System.out.println("카운트!");
                        count++;
                    }
                }
                for (int i = 0; i < 64; i++) {
                    if (extraction.charAt(i) != table2.charAt(i)) {
                        System.out.println("카운트!");
                        count2++;
                    }
                }
                if (count > count2) {
                    countarr[countarrcount++] = count2;
                } else {
                    countarr[countarrcount++] = count;
                }
                extraction = "";
                count = 0;
                count2 = 0;
            }
        }


        for (int i = 0; i < countarrcount; i++) {
            if (min < countarr[i]) {
                min = countarr[i];
            }
        }
        System.out.println(min);
    }
}
