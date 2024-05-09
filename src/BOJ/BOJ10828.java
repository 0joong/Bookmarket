package BOJ;

import java.io.*;

public class BOJ10828 {
    public static void main(String[] args) throws IOException {
        Stack stack = new Stack(10000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = "";
        String[] input;
        input = new String[2];

        for(int i = 0 ; i < n ; i++){
            str = br.readLine();
            input = str.split(" ");

            switch(input[0]){
                case "push" ->{
                    stack.push(Integer.parseInt(input[1]));
                }
                case "pop" ->{
                    stack.pop();
                }
                case "size" ->{
                    stack.size();
                }
                case "top" ->{
                    stack.top();
                }
                case "empty" ->{
                    stack.isEmpty();
                }
            }
        }
    }
}
class Stack{
    int stk[];
    int top;
    int size;
    int capacity;

    public Stack(int capacity){
        stk = new int[capacity];
        this.capacity = capacity;
    }
    public void push(int data){
        stk[top++] = data;
        size++;
    }
    public void pop(){
        if(top==0)
            System.out.println(-1);
        else{
            size--;
            System.out.println(stk[--top]);
        }
    }
    public void isEmpty(){
        System.out.println(top == 0 ? 1 : 0);
    }
    public void top(){
        if(top==0){
            System.out.println(-1);
        }
        else{
            System.out.println(stk[top-1]);
        }
    }
    public void size(){
        System.out.println(size);
    }
}
