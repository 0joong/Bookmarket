package BOJ;

import java.util.Scanner;

public class BOJ4949 {
    public static void main(String[] args) {
        CharStack vpsStack = new CharStack(64);
        Scanner scanner = new Scanner(System.in);

            MAIN:
            while (true){
                char[] pArr = scanner.nextLine().toCharArray();
                boolean isVPS = true;
                for (char p : pArr) {
                    if (p == '(')
                        vpsStack.push(p);
                    else if (p == ')') {
                        if (vpsStack.getTop() == '(')
                            vpsStack.pop();
                        else {
                            isVPS = false;
                            break;
                        }
                    }
                    else if (p == '[')
                        vpsStack.push(p);
                    else if (p == ']') {
                        if (vpsStack.getTop() == '[')
                            vpsStack.pop();
                        else {
                            isVPS = false;
                            break;
                        }
                    }
                    else if (pArr[0] == '.' ){
                        break MAIN;
                    }

                }
                if (isVPS && !vpsStack.isEmpty()) isVPS = false;

                if (isVPS == false) vpsStack.top = 0;
                System.out.printf("%s\n", isVPS ? "yes" : "no");
            }
    }
}

