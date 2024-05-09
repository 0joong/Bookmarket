package BOJ;

import java.util.Scanner;

public class BOJ9012 {
    public static void main(String[] args){
        CharStack vpsStack = new CharStack(64);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();


        for(int i = 0 ; i < n ; i++){
            char[] pArr = scanner.nextLine().toCharArray();
            boolean isVPS = true;
            for(char p : pArr){
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
            }

            if(isVPS && !vpsStack.isEmpty()) isVPS  =false;

            if(isVPS == false){
                vpsStack.top = 0;
            }

            String result = isVPS ? "YES" : "NO";
            System.out.printf("%s\n", result);
        }


//        System.out.printf("%s", isVPS ? "YES" : "NO"); //위 두줄을 한줄로 줄일 수 잇따
    }
}
