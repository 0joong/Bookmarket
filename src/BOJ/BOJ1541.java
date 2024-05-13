package BOJ;

import java.util.Scanner;

public class BOJ1541 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adds[] = scanner.nextLine().split("-");

        int ops[] = new int[adds.length];
        for (int i = 0; i < adds.length; i++) {
            if (adds[i].contains("+"))
                ops[i] = evaluate(adds[i]);
            else
                ops[i] = Integer.parseInt(adds[i]);
        }
        int result = ops[0];

        for (int i = 1; i < ops.length; i++)
            result -= ops[i];

        System.out.println(result);
    }

    static int evaluate(String inStr) {
        String[] adds = inStr.split("\\+");
        int sum = 0;

        for (String add : adds)
            sum += Integer.parseInt(add);
        return sum;
    }
}
