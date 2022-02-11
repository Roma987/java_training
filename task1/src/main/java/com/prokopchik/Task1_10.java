package main.java.com.prokopchik;

import java.util.Scanner;

public class Task1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        if (n % 2 != 0) {
            throw new IllegalArgumentException("Размер массива должен быть четным!!!");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 != 0) {
                    array[i][j] = n - j;
                } else {
                    array[i][j] = j + 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
