package main.java.com.prokopchik;

import java.util.Scanner;

public class Task1_1 {

    public static void main(String[] args) {
        System.out.println("введите четырехзначное число ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum1;
        int sum2;
        int number1;
        int number2;

        number1 = number % 10;
        number2 = number / 10 % 10;
        sum1 = number1 + number2;

        number1 = number / 100 % 10;
        number2 = number / 1000 % 10;
        sum2 = number1 + number2;
        if (sum1 == sum2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
