package Homework_02.Point1.Ex08;

import java.util.Scanner;

import static Homework_02.Point1.Ex08.Ex_08Function.getFactorial;

public class Ex_08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int n = sc.nextInt();
        int i = 1;
        int f = 1;

        f = getFactorial(n, i, f);
        System.out.println("The facorial of " + n + " is " + f);
    }

//    public static int getFactorial(int n, int i, int f) {
//        while (i <= n) {
//            f = f * i;
//            i++;
//        }
//        return f;
//    }
}
