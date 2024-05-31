package chap15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryCatchTest {
    public static void main(String[] args){
        System.out.println("============program start========");
        indexException();
        System.out.println("============program end========");
    }
    public static void arithmeticException() {
        int a = 10, b= 0;
        try {
            int c = a/b;
        }catch (ArithmeticException ae){
//            ae.printStackTrace();
//            System.out.println(ae.toString());
//            System.out.println(ae.getMessage());
        }

    }

    public static void indexException() {
        int[] array = { 0, 1, 2 };
        try {
            System.out.println(array[3]);
        } catch (IndexOutOfBoundsException ie) {
            ie.printStackTrace();
        }
    }

    public static void nullPointerException() {
        String str = null;
        str.charAt(1);
    }

    public static void numberFormatException() {
        String str = "123AA";
        int num = Integer.parseInt(str);
    }

    public static void ioException() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String str = br.readLine();
    }

    public static void classException() {
        //Class.forName("java.lang.String");
        System.out.println("클래스가 있습니다.");
    }
}
