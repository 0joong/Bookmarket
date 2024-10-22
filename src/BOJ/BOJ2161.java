package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue q = new LinkedList();
        int n = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= n ; i++){
            q.offer(i);
        }
        while(q.size()>1){
            System.out.printf("%d ", q.poll());
            q.offer(q.poll());
        }
        System.out.printf("%d ", q.poll());
    }
}
