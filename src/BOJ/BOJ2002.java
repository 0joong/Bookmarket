package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2002 {

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
        while (true) {
            if (sum >= M) {//합이 더 같거나 크면
                sum -= A[start++];//sum에서 start값 빼고 ++
            }
            else if (end == N) break;//end가 끝까지 도달시 탈출
            else {//합이 더 작으면
                sum += A[end++];//sum에 end더하고++
            }

            if (sum == M) {//만약 합과 m이 같으면 count++;
                count++;
            }
        }

        System.out.println(count);
    }
}