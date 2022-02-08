package main.java.com.prokopchik;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите два числа");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if ((x >= -4) && (x <= 4) && (y <= 4) && (y >= -3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
