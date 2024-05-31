package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N, M
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // array A
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 구간합이 M이 되는 경우의 수 구하기
        int count = 0;
        int start = 0, end = 0;
        int sum = 0;
        
        while(true){
            if(sum >= M){
                sum -= A[start++];
            }else if(end == N){
                break;
            }
            else{
                sum += A[end++];
            }
            if(sum == M){
                count++;
            }
        }
        System.out.println(count);
    }
    
    
    
}
