package main.java.com.prokopchik;


import java.util.Scanner;

public class Task1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива 1");
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        System.out.println("введите размер массива 2");
        int n1 = scanner.nextInt();
        int[] array2 = new int[n1];
        System.out.println("введите число k, но не больше первого массива");
        int k = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            array1[i] = 1;
        }
        for (int i = 0; i < n1; i++) {
            array2[i] = 2;
        }
        int[] array3 = new int[(array1.length + array2.length)];
        for (int i = 0; i < array3.length; i++) {
            if (k > i) {
                array3[i] = array1[i];
            } else if (count < n1) {
                array3[i] = array2[count];
                count++;
            } else
                array3[i] = array1[n - k - 1];
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "  ");
        }
    }
}

