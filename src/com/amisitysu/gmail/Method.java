package com.amisitysu.gmail;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ціле число: 8");
        int number = 8;
        int square = number * number;
        System.out.println("Квадрат числа " + number + " дорівнює " + square + ".");

        double radius = 7;
        double height = 21;
        double volume = Math.PI * radius * radius * height;
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");

        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");

        String inputString = "Привіт Друзі!";
        String reversedString = new StringBuilder(inputString).reverse().toString();
        System.out.println("Рядок в зворотньому порядку: " + reversedString);

        int a = 7;
        int b = 8;
        int powerResult = (int) Math.pow(a, b);
        System.out.println("Результат " + a + "^" + b + " дорівнює " + powerResult + ".");

        int n = 6;
        String textString = "Hola amigo";
        for (int i = 0; i < n; i++) {
            System.out.println(textString);
        }

        scanner.close();
    }
}