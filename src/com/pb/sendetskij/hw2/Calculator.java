package com.pb.sendetskij.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Создадим переменные
        int x;
        int y;
        String mathOper;
        double resultOper;

        // Создадим сканер
        Scanner scan = new Scanner(System.in);

        // Запустим сбор данных
        System.out.println("Вкажіть перше ціле число");
        // Проверим что бы тип данных соответствовал заданному
        try {
            x = scan.nextInt();
            System.out.println("Вкажіть друге ціле число:");
            y = scan.nextInt();
            System.out.println("Вкажіть один математичний оператор для виконнаня дій: + , -, * , \\");
            mathOper = scan.next();
            // Выполним переданный оператор
            switch (mathOper){
                case "+":
                    resultOper = x + y;
                    System.out.println("Сумма значень дорівнює: " + resultOper);
                    break;
                case "-":
                    resultOper = x - y;
                    System.out.println("Різниця значень дорівнює: " + resultOper);
                    break;
                case "*":
                    resultOper = x * y;
                    System.out.println("Множина значень дорівнює: " + resultOper);
                    break;
                case "\\" :
                    // Проверим что на 0 делить нельзя
                    if(y == 0){
                        System.out.println("!!! Ділення на нуль заборонено !!!");
                    }else{
                        // Поделим так что бы вернуть все знаки после запятой
                        resultOper = (double) x / y;
                        System.out.println("Ділення значень дорівнює: " + resultOper);
                    }
                    break;
                default: System.out.println("!!! Невірно вказанний один з математичних операторів для виконнаня дій: '+','-','*','\\'");
            }
        } catch (Exception e) {
            System.out.println("!!! Некорекето вказанні дані !!!");
        }
    }
}
