package Homework_02.Point1.Ex02;
import static Homework_02.Point1.Ex02.Ex_02Function.getMin;
public class Ex_02 {

    public static void main(String[] args) {

        int[] num = {100, 25, 3, 41, 15, 20, 58, 69, 89, 63, 46, 11};
        int min =num[0];
        int i;

        min = getMin(num, min);
        System.out.println(min);
    }

//    private static int getMin(int[] num, int min) {
//        int i;
//        for (i=0; i< num.length; i++){
//            if (num[i] < min){
//                min = num[i];
//            }
//        }
//        return min;
//    }
}
