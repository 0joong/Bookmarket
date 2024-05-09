package BOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ5618 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();//숫자 n개
        int arr[] = new int[n];//공약수 구할 숫자
        ArrayList<Integer> divisor = new ArrayList<>();
        ArrayList<Integer> divisor2 = new ArrayList<>();
        ArrayList<Integer> divisor3 = new ArrayList<>();
        for(int i = 0; i <n;i++){//값넣기
            arr[i] = scanner.nextInt();
        }

        for(int i = 2; i<=arr[0];i++){
            if(arr[0]%i==0){
                divisor.add(i);
            }
        }
        for(int i = 2; i<=arr[1];i++){
            if(arr[1]%i==0){
                if(divisor.contains(i)){
                    divisor2.add(i);
                }
            }
        }
        if(n==3){
            for(int i = 2; i<=arr[2];i++){
                if(arr[2]%i==0){
                    if(divisor2.contains(i)){
                        divisor3.add(i);
                    }
                }
            }
        }
        if(n==3){
                System.out.println(1);
            for(int i : divisor3){
                System.out.println(i);
            }
        }else{
            System.out.println(1);
            for(int i : divisor2){
                System.out.println(i);
            }
        }
    }
}
//전부다 구한다음 3개씩 겹치는 것만 뽑는 방향으로 개선?