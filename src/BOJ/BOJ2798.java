package BOJ;

import java.util.Scanner;

public class BOJ2798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//카드 n장
        int m = scanner.nextInt();//n장 중 3장을 뽑아서 m을 넘지 않으면서 m에 최대한 가까운 카드 3장의 합
        int card[] = new int[n];//card n장의 값을 저장할 배열

        for (int i = 0; i < n; i++) {
            card[i] = scanner.nextInt();
        }
        int sum = 0;//찾고자 하는 m을 넘지 않으면서 m에 최대한 가까운 카드 3장의 합


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++){
                    if((i==j || j == k) || k ==i) continue;

                    int i1 = card[i] + card[j] + card[k];

                    if(i1 >=sum && i1 <=m){
                        sum = i1;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
