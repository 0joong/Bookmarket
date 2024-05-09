package BOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ1966 {
    public static boolean isFirst(LinkedList<Integer> q) {
        for (int i = 0; i < q.size(); i++)
            if (q.get(0) < q.get(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> q = new LinkedList<>();

        int testcase = scanner.nextInt();//testcase 몇개 받을 것인지
        for (int i = 0; i < testcase; i++) {
            int count = 1;//출력 순서 카운트
            int n = scanner.nextInt();//문서의 개수
            int m = scanner.nextInt();//출력 순서 궁금한 문서 index
            /*
            중요도는 중복될 수 있기에 m값을 적절히 변화시켜
            같은 숫자 중에서도 어떤 것이 우리가 원하는 문서인지 찾을 수 있다
            제일 중요한 변수
            */
            scanner.nextLine();
            String priority[] = scanner.nextLine().split(" ");//중요도 문장 1라인 입력받아 공백 단위로 priority string 배열에 저장
            for (String o : priority) //큐 삽입
                q.offer(Integer.parseInt(o));

            while (true) {
                if (!isFirst(q)) {
                    /*
                    isFirst : queue의 첫번째 요소가 우선순위가 제일 높은지 알려주는 메서드 반환타입 boolean
                    !isFirst(q) : queue의 첫번째 요소보다 우선 순위가 높은 요소가 있는 경우 실행
                     */
                    if (m == 0) {//찾는 문서가 출력큐 맨 앞에 있지만 중요도가 밀려서 맨 뒤로 가는 경우
                        m = q.size() - 1;//order는 index이므로 size()에서 -1해줌
                        q.offer(q.poll());//빼고 그 값을 다시 큐에 추가하면 맨 앞 요소를 맨 뒤에 넣어주게됨
                    } else {
                        q.offer(q.poll());
                        m--;//맨 앞 요소가 하나 빠지고 뒤로 들어왔으니 기존 요소들은 한칸씩 앞으로 이동한다
                    }
                } else {//isFirst가 true인 경우
                    if (m == 0) {
                        /*
                        isFirst가 true이고 order도 첫번째인 경우
                        출력 순서(count) 출력하며 break
                         */
                        System.out.printf("%d\n", count);
                        break;
                    } else {
                        /*
                        isFirst가 true이지만
                        찾는 문서가 아닌 경우
                         */
                        q.poll();
                        count++;
                        m--;
                    }
                }
            }
            q.clear();//다음 케이스를 위해 큐 초기화
        }
    }
}