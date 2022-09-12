package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float s;
        int p;
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите фигуру(треугольник,круг,квадрат)");
        String figura = in.nextLine();
        switch (figura) {
            case "t": {
                System.out.println("Введите стороны треугольника");
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                if (a + b < c || a + c < b || b + c < a) {
                    System.out.println("Треугольник не может существовать!");
                } else {
                    p = (a + b + c) / 2;
                    s = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
                    System.out.println("Площадь треугольника:" + s);
                }
                break;
            }
            case "p": {
                System.out.println("Введите стороны прямоугольника");
                int a = in.nextInt();
                int b = in.nextInt();
                s = a * b;
                System.out.println("Площадь прямоугольника:" + s);
                break;
            }
        }
    }
}
