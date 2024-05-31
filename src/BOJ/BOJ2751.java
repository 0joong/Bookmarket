package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0 ; i < N ; i++)
            arr[i] = (Integer.parseInt(br.readLine()));

        Arrays.sort(arr);
        String result="";
        StringBuilder sb = new StringBuilder();
        
        for(int i : arr)
            sb.append(i+"\n");
        
//        for(int i : arr)
//            result += i + "\n";
//        
//        System.out.println(result);
        
        System.out.println(sb);
    }
}
