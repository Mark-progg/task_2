package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру на улице:");
        int degree = scanner.nextInt();
        System.out.println("Есть ли дождь?:");
        String rain = scanner.next();
        System.out.println("Есть ли ветер?:");
        String wind = scanner.next();

        if (degree > 45 || degree < -45){
            System.out.println("На улицу лучше не выходить");
        } else if (degree < 0){
            System.out.println("Холодно, нужны зимние вещи");
        } else if (degree < 10){
            System.out.println("Прохладно, нужна осення куртка");
        } else if (degree <20){
            System.out.println("Вам будет комфортно в кофте");
        } else {
            System.out.println("Жара, прикрывайтесь от солнца");
        }

        if (rain.equals("да")) {
            System.out.println("Нужно взять зонтик");
        } else {
            System.out.println("Зонт не нужен");
        }

        if (wind.equals("да")) {
            System.out.println("Нужно надеть не продуваемую одежду");
        } else {
            System.out.println("Не нужно надевать не продуваемую одежду");
        }

    }
}