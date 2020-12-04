package Point1.Ex05;

public class Ex_05Function {
    public static boolean prim2(int n) {
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
