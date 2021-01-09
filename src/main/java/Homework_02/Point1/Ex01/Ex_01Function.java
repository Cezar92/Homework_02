package Homework_02.Point1.Ex01;

public class Ex_01Function {
    public static boolean prim(int n) {
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
