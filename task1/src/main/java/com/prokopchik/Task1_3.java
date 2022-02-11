package main.java.com.prokopchik;

import java.util.Scanner;

public class Task1_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите катет а ");
        int a = scanner.nextInt();
        System.out.println("введите катет b ");
        int b = scanner.nextInt();
        double s = (a * b) / 2;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double p = a + b + c;
        System.out.printf("Периметр %s , площадь %s%n", p,s);
    }
}
