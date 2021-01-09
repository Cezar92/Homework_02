package Homework_02.Point1.Ex09;

import java.util.Arrays;

import static Homework_02.Point1.Ex09.Ex_09Function.newArr;

public class Ex_09 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 40, 50, 50};
        int n = arr.length;
        int[] arr_temp = new int[n];
        int j = 0;
        int count = 1;
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr_temp[j++] = arr[i];
                count++;
            }
        }
        arr_temp[j] = arr[n - 1];

        int[] newArr = new int[count];

        newArr(arr_temp, count, newArr);

        for (int i = 0; i < newArr.length; i++)
            System.out.print(newArr[i] + " ");
    }

//    public static void newArr(int[] arr_temp, int count, int[] newArr) {
//        for (int i = 0; i < count; i++) {
//            newArr[i] = arr_temp[i];
//        }
//    }
}
