package main.java.com.prokopchik;

import java.util.Scanner;

public class Task1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число a");
        double a = scanner.nextDouble();
        System.out.println("введите число b ");
        double b = scanner.nextDouble();
        System.out.println("введите шаг ");
        double h = scanner.nextDouble();
        double x = 0;
        int i = 0;
        double F;
        while (x < b) {
            x = a + i * h;
            F = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
            System.out.println(x + "    " + F);
            i++;
        }

    }
}
