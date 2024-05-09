package BOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ1436 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();//종말의수저장
        for(int i = 666 ; a.size() <= n ; i++){
            if(isEndNum(i)){
                a.add(i);
            }
        }
        System.out.println(a.get(n-1));
    }
    public static boolean isEndNum(int num){
        int count = 0;//count 3이상이면 종말의 수
        for(int i = 0 ; i < num ; i++){
            if(num%10==6){
                count++;
                num/=10;
            }
            else{//다음 숫자가 0이 아니면 카운트 초기화
                count = 0;
                num/=10;
            }
            if(count>=3){//연속 3개면 탈출
                return true;
            }
        }
        return false;
    }
}
