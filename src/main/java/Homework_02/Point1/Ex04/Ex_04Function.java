package Homework_02.Point1.Ex04;

public class Ex_04Function {
    public static String getString(int i, String st, int a, String st2) {
        while (i < a) {

            st2 = st2 + st.charAt(a - 1);
            a--;
        }
        return st2;
    }
}
