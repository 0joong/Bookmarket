package chap15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class exceptiontest {
    public static void main(String[] args){
        arithmeticException();
        indexException();
    }
    public static void arithmeticException() {
        int a = 10, b= 0;
        int c = a/b;
    }

    public static void indexException() {
        int[] array = { 0, 1, 2 };
        System.out.println(array[3]);
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
