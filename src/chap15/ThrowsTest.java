package chap15;

public class ThrowsTest {
    public static void main(String[] args){

        try {
            method1();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("=== 프로그램 종료 ===");
    }

    static void method1() throws ClassNotFoundException {
        method2();
    }

    static void method2() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
