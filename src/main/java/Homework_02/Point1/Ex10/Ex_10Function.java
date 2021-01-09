package Homework_02.Point1.Ex10;

public class Ex_10Function {
    public static boolean isSquare(int[][] arr1) {
        for (int i = 0, l = arr1.length; i < l; i++) {
            if (arr1[i].length != l) {
                return false;
            }
        }
        return true;
    }
}
