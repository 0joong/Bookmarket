package BOJ;

import java.util.LinkedList;
import java.util.Scanner;

public class BOJ1966_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for(int o = 0 ; o < N ; o++){
            int count = 1;
            int docuNum = sc.nextInt();
            int Index = sc.nextInt();
            LinkedList<Integer> d = new LinkedList<>(); // 문서를 저장할 Queue생성
            LinkedList<Integer> indexQ = new LinkedList<>();// 인덱스
            for (int i = 0; i < docuNum; i++) {
                d.offer(sc.nextInt());// document
                indexQ.offer(i);
            }
            while (true) {
                for (int j = 0 ; j< d.size();j++){//개선의 여지 있음
                    for (int i = 1; i < d.size(); i++) {
                        if (d.get(0) < d.get(i)) {
                            d.offer(d.poll());
                            indexQ.offer(indexQ.poll());
                            break;
                        }
                    }
                }
                d.poll();
                if (indexQ.poll() == Index)
                    break;
                else
                    count++;
            }
            System.out.println(count);
        }
    }
}