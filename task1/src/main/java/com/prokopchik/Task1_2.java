package main.java.com.prokopchik;

import java.util.Scanner;

public class Task1_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число ");
        double a = scanner.nextInt();
        System.out.println("введите число ");
        double b = scanner.nextInt();
        System.out.println("введите число ");
        double c = scanner.nextInt();
        double d = (b + Math.sqrt(Math.pow(b, 2)) + 4 * a * c);

        double v = 2 * a;
        double x = Math.pow(a, 3) * c;
        double sum = d / v - x + Math.pow(b, -2);
        System.out.println(sum);
    }
}
