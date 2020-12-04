package Point1.Ex08;

public class Ex_08Function {
    public static int getFactorial(int n, int i, int f) {
        while (i <= n) {
            f = f * i;
            i++;
        }
        return f;
    }
}
