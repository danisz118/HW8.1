package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ");
        int i = scan.nextInt();
        int result = numberFibonacci(i);
        System.out.println("numberFibonacci: " + result);
    }
    private static int numberFibonacci(int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return numberFibonacci(i - 1) + numberFibonacci(i - 2);
        }
    }
}
