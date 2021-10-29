package com.pb.sendetskij.hw4;

import java.util.Scanner;

/**
 * Класс позволяет обработать строку и  изменить каждую букву в каждом слове на заглавную
 * Метод main
 */
public class CapitalLetter {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок:");
        String inputString = scanner.nextLine();
        String outStirng = procString(inputString);
        System.out.println("Результат:");
        System.out.println(outStirng);
    }
    // Приватній метод для обработки строки
    private static String procString(String inputString) {
        // Строку в массив
        char[] inputArray = inputString.toCharArray();
        // Первая буква в первом слове заглавная
        inputArray[0] = Character.toUpperCase(inputArray[0]);
        // Цикл пройтись по остальным словам и заменить первые буквы
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] == ' ') {
                //
                inputArray[i + 1] = Character.toUpperCase(inputArray[i + 1]);
            }
        }
        // Создать новую строку ( заменить )
        inputString = new String(inputArray);
        // Вернуть ответ
        return inputString;
    }

}
