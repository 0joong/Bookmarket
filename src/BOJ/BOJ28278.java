package BOJ;

import java.io.*;

public class BOJ28278 {
    public static void main(String[] args) throws IOException {
        Stack1 stack = new Stack1(1_000_000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = "";
        String[] input;
        input = new String[2];

        for (int i = 0; i < n; i++) {
            str = br.readLine();
            input = str.split(" ");

            switch (input[0]) {
                case "1" -> {
                    stack.push(Integer.parseInt(input[1], 10));
                }
                case "2" -> {
                    stack.pop();
                }
                case "3" -> {
                    stack.size();
                }
                case "4" -> {
                    stack.isEmpty();
                }
                case "5" -> {
                    stack.top();
                }
            }
        }
    }
}

class Stack1 {
    int stk[];
    int top;
    int capacity;

    public Stack1(int capacity) {
        stk = new int[capacity];
        this.capacity = capacity;
    }

    public void push(int data) {
        stk[top++] = data;
    }

    public void pop() {
        if (top == 0)
            System.out.println(-1);
        else {
            System.out.println(stk[--top]);
        }
    }

    public void isEmpty() {
        System.out.println(top == 0 ? 1 : 0);
    }

    public void top() {
        if (top == 0) {
            System.out.println(-1);
        } else {
            System.out.println(stk[top - 1]);
        }
    }

    public void size() {
        System.out.println(top);
    }
}
