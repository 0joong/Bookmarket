package chap15;

public class MultiCatchTest {
    public static void main(String[] args) {
        System.out.println("=== 프로그램 시작 ===");

        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]의 value = " + value);
            } catch (NumberFormatException e) {
                System.out.println("숫자가 아닌 문자열입니다.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.toString());
            }
        }

        System.out.println("=== 프로그램 종료 ===");

    }
}
