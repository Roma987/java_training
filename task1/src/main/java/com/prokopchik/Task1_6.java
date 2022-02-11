package main.java.com.prokopchik;

import java.util.Scanner;

public class Task1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите три числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum;
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        sum = min + max;
        System.out.println("сумма равна " + sum);


    }
}
