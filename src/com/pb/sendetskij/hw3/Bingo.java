package com.pb.sendetskij.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        //создадим рандомное число
        Random rand = new Random();
        int numbRand = rand.nextInt(101);
        // System.out.println(numbRand);
        // Предложим пользователю сыграть
        System.out.println("!!! Привіт !!!");
        System.out.println("Зіграймо в відгадайку");
        System.out.println("Спробуй відгадати число від 0 до 100");
        System.out.println("Для завершення гри у будь якій стадії вкажи у відповідь \"EXIT\"");
        System.out.println("Вкажи число:");
        int numbAtt = 0;
        // Запустим цикл игры
        while (true) {
            numbAtt += 1;
            // Создадим сканер
            Scanner scan = new Scanner(System.in);
            // Проверим что бы тип данных соответствовал заданному
            String numUser;
            try {
                numUser = scan.next();
                if ("EXIT".equals(numUser) || "exit".equals(numUser)) {
                    System.out.println("!!! Дякуємо гра завершена !!!");
                    break;
                }
                int intNumUser = Integer.parseInt(numUser);
                if (intNumUser < 0 || intNumUser > 100) {
                    System.out.println("!!! Нажаль мій друже, вказане тобою значення не відповідає умові !!!");
                    System.out.println("Спробуй ще, або заверши гру відповідью \"EXIT\"");
                    System.out.println("Вкажи число:");
                    if (true) {
                        continue;
                    }
                } else if (numbRand == intNumUser) {
                    System.out.println("!!! Вітаю Ви переможець, скрите число вгадано " + numbRand + " !!!");
                    System.out.println("Ваша кількість cпроб: " + numbAtt);
                    break;
                } else if (numbRand > intNumUser) {
                    System.out.println("!!!Нажаль Ви не вгадали!!!");
                    System.out.println("Загадане число трохи білше вказанного");
                    System.out.println("Вкажи число:");
                    if (true) {
                        continue;
                    }
                } else if (numbRand < intNumUser) {
                    System.out.println("!!!Нажаль Ви не вгадали!!!");
                    System.out.println("Загадане число трохи менше вказанного");
                    System.out.println("Вкажи число:");
                    if (true) {
                        continue;
                    }
                }
            } catch (Exception e) {
                // если пользователь ввел не число
                System.out.println("!!! Нажаль мій друже, вказане тобою значення не являється числом !!!");
                System.out.println("Спробуй ще, або заверши гру відповідью \"EXIT\"");
                System.out.println("Вкажи число:");
                if (true) {
                    continue;
                }
            }
        }
    }
}