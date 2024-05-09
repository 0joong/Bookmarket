package BOJ;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack stack = new Stack();
        int n = Integer.parseInt(br.readLine());
        String str = "";
        String result[] = {
          new String(""), new String(""), new String(""), new String(""), new String("")
        };

        for(int i = 0 ; i < n ; i++){
            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while(st.hasMoreTokens()){
                stack.push(st.nextToken());
            }
            while(!stack.isEmpty()){
                result[i] = result[i].concat(stack.pop() + " ");
            }
        }

        for(int i = 0;i < n ; i++){
            System.out.printf("Case #%d: %s\n", i+1, result[i]);
        }
    }
}
