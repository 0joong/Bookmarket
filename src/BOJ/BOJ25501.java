package BOJ;

import java.util.Scanner;

public class BOJ25501 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%d\n", fivo(scanner.nextInt()));
    }
    public static int fivo(int i){
        if(i>1){
            return fivo(i-1) + fivo(i-2);
        }
        else if(i==1){
            return 1;
        }
        else{
            return 0;
        }
    }
}
