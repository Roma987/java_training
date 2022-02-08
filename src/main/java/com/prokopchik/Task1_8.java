package main.java.com.prokopchik;

import java.util.Random;
import java.util.Scanner;

public class Task1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива");
        int size = scanner.nextInt();
        System.out.println("введите диапазон значений");
        int range = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(range);
        }
        System.out.println("введите число К");
        int k = scanner.nextInt();
        int sum = 0;
        for (int number : array) {
            if (number % k == 0){
                sum+= number;
            }
        }
        System.out.printf("Сумма чисел кратных К = %s", sum);
    }
}
