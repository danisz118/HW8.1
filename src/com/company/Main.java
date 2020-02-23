package com.company;
/*
Число Фибоначи
написать метод который возвращает N-ное число фибоначи, по правилу:
F(0) = 0, F(1) = 1
F(N) = F(N - 1) + F(N - 2)
*/

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
