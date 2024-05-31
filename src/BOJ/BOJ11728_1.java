package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11728_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arrA = new int[N];
        int[] arrB = new int[M];
        for(int i = 0; i < N; i++)
            arrA[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++)
            arrB[i] = Integer.parseInt(st.nextToken());

        int pA = 0;
        int pB = 0;
        int[] result = new int[M+N];
        int pR = 0;
        while(pA < N && pB < M){
            if(arrA[pA] <= arrB[pB]){
                result[pR++] = arrA[pA++];
            } else{
                result[pR++] = arrB[pB++];
            }
        }

        while(pA < N) result[pR++] = arrA[pA++];
        while(pB < M) result[pR++] = arrB[pB++];

        for(int i : result){
            System.out.printf("%d ", i);
        }
    }

}
