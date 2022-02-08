package main.java.com.prokopchik;

import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите три числа");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        if (a > 0) {
            System.out.println("a = " + Math.pow(a, 2));
        } else {
            System.out.println("a = " + Math.pow(a, 4));
        }
        if (b > 0) {
            System.out.println("b = " + Math.pow(b, 2));
        } else {
            System.out.println("b = " + Math.pow(b, 4));
        }
        if (c > 0) {
            System.out.println("c = " + Math.pow(c, 2));
        } else {
            System.out.println("c = " + Math.pow(c, 4));
        }

    }
}
