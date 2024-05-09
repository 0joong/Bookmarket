package BOJ;

import java.util.Scanner;

public class BOJ2231 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int o = 0;
        int arr[]=new int[1_000_000]; //n의 각 자릿수 저장할 배열
        int constructor=0;

        while(n!=0){//arr에 각 자릿수 저장
            arr[o] = n%10;
            n/=10;
            o++;
        }
        for(int i = 0; i<10;i++){

        }



//        for(int j = 0; j < i ; j ++){
//            System.out.println(arr[j]);
//        }
    }
}
