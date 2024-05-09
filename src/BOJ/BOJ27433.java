package BOJ;

import java.util.Scanner;

public class BOJ27433 {
    static int sum = 1;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(fact(scanner.nextInt()));
    }
    static long fact(int n){
        if(n>0){
            return n*fact(n-1);
        }
        else{
            return 1;
        }
        //return n>0 ? n*fact(n-1) : 1;
    }
}
