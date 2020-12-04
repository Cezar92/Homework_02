package Point1.Ex04;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {
        System.out.println("Type an integer number:");
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        int i = 0;
        String st = String.valueOf(nr);
        int a = st.length();
        String st2 = "";

        st2 = Ex_04Function.getString(i, st, a, st2);
        if (st.equals(st2)) {
            System.out.println("The number is palindrom.");
        } else
            System.out.println("The number is not palindrom");
    }

//    public static String getString(int i, String st, int a, String st2) {
//        while (i < a) {
//
//            st2 = st2 + st.charAt(a - 1);
//            a--;
//        }
//        return st2;
//    }
}
