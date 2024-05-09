package BOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String result = "";

        for (int i = 1; i <= n; i++)
            que.offer(i);

        result += "<";

        while (!que.isEmpty()) {
            for (int i = 0; i < k - 1; i++)
                que.offer(que.poll());

            result += que.poll();
            if (!que.isEmpty())
                result += ", ";
        }
        result += ">";
        System.out.println(result);
    }
}