package com.myapp.learn;

import java.util.Scanner;

public class P1209 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long sum = a + b;
        long diff = a - b;
        long prod = a * b;


        if (b == 0) {
            System.out.println(sum + " " + diff + " " + prod + " NoAnswer");
        } else {
            long quot = a / b;
            System.out.println(sum + " " + diff + " " + prod + " " + quot);
        }
    }
}