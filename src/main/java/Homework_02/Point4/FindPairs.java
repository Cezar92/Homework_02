package Homework_02.Point4;

import java.util.Scanner;

import static Homework_02.Point4.Function.sumOfPairs;

public class FindPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the number: ");
        int n = sc.nextInt();
        int[] arr = {5, 3, 8, 2, 3, 9, 10, 16 ,1};

        sumOfPairs(n, arr);
    }
}
