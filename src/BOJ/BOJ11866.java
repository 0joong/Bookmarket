package BOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ11866 {
    public static void main(String[] args) {
        LinkedList<Integer> q = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//사람 수
        int k = scanner.nextInt();//제거할 자리
        String result = "";

        for (int i = 1; i <= n; i++) { //큐에 사람 넣기
            q.add(i);
        }
        MAIN:
        while (n != 0) {//사람 제거
            if (k == 1) {
                if (q.isEmpty()) {
                    break MAIN;
                }
                if (!q.isEmpty()) {
                    result += (q.remove() + ", ");
                }
            }
            for (int i = 0; i < k - 1; i++) {
                if (q.isEmpty()) {
                    break MAIN;
                } else {
                    q.add(q.remove());//앞 요소 빼고 뒤에 다시 넣기
                }
            }
            if (!q.isEmpty()) {
                result += (q.remove() + ", ");
            }
        }
        result = result.substring(0, result.length() - 2);
        System.out.printf("<%s>", result);
    }
}
