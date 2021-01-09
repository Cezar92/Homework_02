package Homework_02.Point1.Ex01;

public class Ex_01 {

//    public static boolean prim(int n) {
//        for (int i = 2; i < n; i++) {
//            if ((n % i) == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int n = 2;
        
        while(i<=100){
            if (Ex_01Function.prim(n)){
                System.out.println(n);
                sum = sum +n;
                i++;
            } n++;

        }
        System.out.println("The sum is "+ sum);
    }
}
