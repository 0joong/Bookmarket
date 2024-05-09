import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ2164 {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for(int i = 1 ; i <= n ; i++){
            q.offer(i);
        }
//        for(int i : q){
//            System.out.printf("%d ", i);
//        }
        while(n>1){
            q.poll();
            q.offer(q.poll());
            n--;
        }
        System.out.printf("%d", q.poll());
    }
}
