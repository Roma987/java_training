package main.java.com.prokopchik;

import java.util.Scanner;

public class Input {

    int a;
    double b;
    double c;
    double d;

    public void consoleInputOneParameter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите четырехзначное число ");
        a = scanner.nextInt();
    }

    public void consoleInputTwoParameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите катет а ");
        d = scanner.nextDouble();
        System.out.println("введите катет b ");
        c = scanner.nextDouble();
    }

    public void consoleInputThreeParameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число ");
        b = scanner.nextDouble();
        System.out.println("введите второе число ");
        c = scanner.nextDouble();
        System.out.println("введите третье число ");
        d = scanner.nextDouble();
    }
}
