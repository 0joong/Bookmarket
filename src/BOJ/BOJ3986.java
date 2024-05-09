package BOJ;

import java.util.Scanner;

public class BOJ3986 {
    public static void main(String[] args) {
        CharStack cs = new CharStack(64);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int count = 0;

        for (int i = 0; i < n; i++) {
            char[] pArr = scanner.nextLine().toCharArray();
            boolean isGoodword = true;
            for (char p : pArr) {

                if (p == 'A'){
                    if(cs.getTop()=='A'){
                        cs.pop();
                    }
                    else {
                        cs.push(p);
                    }
                }
                else if (p == 'B') {
                    if (cs.getTop() == 'B') {
                        cs.pop();
                    }
                    else {
                        isGoodword = false;
                        break;
                    }
                }


            }
            if (isGoodword && !cs.isEmpty()) isGoodword = false;

            cs.clear();

            if (isGoodword == true) count++;
        }
        System.out.printf("%d", count);
    }
}

class CharStack {
    int top;
    private char stack[];
    private int capacity;

    public CharStack(int capacity) {
        stack = new char[capacity];
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == capacity;
    }

    public boolean push(char par) {
        if (isFull()) return false;
        stack[top++] = par;
        return true;
    }

    public char pop() {
        if (isEmpty()) return '0';
        return stack[--top];
    }

    public char getTop() {
        if (isEmpty()) return '0';
        return stack[top - 1];
    }

    public void clear() {
        top = 0;
    }

    public char getTop1() {
        if (isEmpty()) return '0';
        return top >=2 ? stack[top - 2] : 0;
    }
}
