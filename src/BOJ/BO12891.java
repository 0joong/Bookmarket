package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BO12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // S, P
        st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        // DNA 문자열 (S) {A, C, G, T} -> {'0', '1', '2', '3'}

        String repStr = br.readLine().replace('A', '0').replace('C', '1').replace('G', '2').replace('T', '3');
        char[] DNA = repStr.toCharArray();

        // 비밀번호 조건
        st = new StringTokenizer(br.readLine());
        int[] cond = new int[4];
        for (int i = 0; i < 4; i++) {
            cond[i] = Integer.parseInt(st.nextToken());
        }


        // 첫번째 구간에 대해서 데이터를 수집하고  조건 check
        int start = 0, end = P - 1, count = 0;
        int[] freq = {0, 0, 0, 0};
        for (int i = start; i <= end; i++) {
            freq[DNA[i] - '0']++;
        }
        if (checkFreq(freq, cond)) {
            count++;
        }

        // window를 sliding하면서 데이터 갱신, 조건 check
        while (end < S - 1) {
            freq[DNA[start++] - '0']--;
            freq[DNA[++end] - '0']++;
            if (checkFreq(freq, cond)) {
                count++;
            }
        }


        // count 출력
        System.out.println(count);

    }

    static boolean checkFreq(int[] freq, int[] cond) {
        for (int i = 0; i < 4; i++) {
            if (freq[i] < cond[i]) {
                return false;
            }
        }
        return true;
    }
}