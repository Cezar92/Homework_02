package Point1.Ex05;
import static Point1.Ex05.Ex_05Function.prim2;
import java.util.Scanner;

public class Ex_05 {

//    public static boolean prim2(int n) {
//        for (int i = 2; i < n; i++) {
//            if ((n % i) == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
        int sum = 0;
        int n = 2;
        System.out.println("Type the maximum number.");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();

        while(n<j){
            if (prim2(n)){
                System.out.println(n);
            }
            n++;
        }
    }
}
