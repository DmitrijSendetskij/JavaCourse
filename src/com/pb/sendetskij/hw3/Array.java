package com.pb.sendetskij.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
        public static <procedure> void main(String[] args) {
                // Создадим массив
                int[] array = new int[10];
                // Создадим сканер
                Scanner scan = new Scanner(System.in);
                // Предложим пользователю ввести
                System.out.println("Вкажіть десять цілих чисел");
                int x;
                try {
                        for (int i = 0; i < 10; i++) {
                                int n = i+1;
                                System.out.println("Вкажіть " + n + " число");
                                x = scan.nextInt();
                                array[i] = x;
                        }
                        System.out.println("Вказаний Вами масив данних: " );
                        System.out.println(Arrays.toString(array));
                        System.out.println("Сума чисел у масиві: " );
                        int sum = 0;
                        for (int i = 0; i < array.length; i++) {
                                sum = sum + array[i];
                        }
                        System.out.println(sum);
                        int sumposit = 0;
                        for (int i = 0; i < array.length; i++) {
                             if(array[i] > 0){
                                   sumposit = sumposit + 1;
                             }
                        }
                        System.out.println("Кількість позитивних чисел у масиві: " );
                        System.out.println(sumposit);

                        for(int i=0; i<array.length-1; i++){
                                for(int j = array.length-1; j>i; j--){
                                        if(array[j-1] > array[j]){
                                                int sor = array[j-1];
                                                array[j-1] = array[j];
                                                array[j] = sor;
                                        }
                                }
                        }
                        System.out.println("Відсортований масив чисел по зростанню: " );
                        System.out.println(Arrays.toString(array));
                } catch (Exception e) {
                        System.out.println("!!! Некорекето вказанні дані !!!");
                }
        }
}
