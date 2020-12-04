package Point1.Ex03;
import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {
        System.out.println("Type a number.");
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int max = 0;

        max = Ex_03Function.getMax(st, max);
        System.out.println("The max number is: "+ max);
    }

//    public static int getMax(String st, int max) {
//        for (int i = 0; i < st.length(); i++){
//            if (Character.getNumericValue(st.charAt(i)) > max){
//                max = Character.getNumericValue(st.charAt(i));
//            }
//        }
//        return max;
//    }
}

