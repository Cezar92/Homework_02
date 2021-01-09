package Homework_02.Point1.Ex02;

public class Ex_02Function {
    public static int getMin(int[] num, int min) {
        int i;
        for (i=0; i< num.length; i++){
            if (num[i] < min){
                min = num[i];
            }
        }
        return min;
    }
}
