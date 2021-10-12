package com.pb.sendetskij.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        // Создадим переменную типа число
        int x;
        // Создадим сканер
        Scanner scan = new Scanner(System.in);
        // Предложем ввести целое число
        System.out.println("Введіть будь ласка ціле число:");
        // Проверим корректность ввода данных
        try{
            // Запустим сканер для получения значения
            x = scan.nextInt();
            // При успешном вводе корректныхх параметров вернем ответ
                 if(x >= 0 && x <= 14){
                     System.out.println("Значення знаходиться в проміжку від 0 до 14");
            }
            else if(x >= 15 && x <= 35){
                     System.out.println("Значення знаходиться в проміжку від 15 до 35");
            }
            else if(x >= 36 && x <= 50){
                     System.out.println("Значення знаходиться в проміжку від 36 до 50");
            }
            else if(x >= 51 && x <= 100){
                     System.out.println("Значення знаходиться в проміжку від 51 до 100");
            }
            else{System.out.println("Зазначене вами число не потрапляє в завідомо задані проміжки [0-14],[15-35],[36-50],[51-100]");}
        }
        // в случае если тип данных не равен число укажем на это
        catch (Exception e){
            System.out.println("!!! Некоректний тип даних !!!");
      }
    }
}
