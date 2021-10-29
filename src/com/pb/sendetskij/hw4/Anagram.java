package com.pb.sendetskij.hw4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Класс возвращает несколько вариантов анограм по текстам
 * 1. С учетом регистра и символов
 * 2. Без учета регистра
 * 3. Без учета регистра и символов
 * !!!!! Методы не учитывают язык на котором вводятся строки. Если он разный ответ будет негативный !!!!
 */
public class Anagram {
    // Основной метод
    public static void main(String[] args) {
        System.out.println("!!! УВАГА !!! Жоден з методів не враховує мову даних, що вводяться !!! ");
        String oneText = oneText();
        String twoText = twoText();
        if(methAnagramSignReg(oneText,twoText)){
            String outResult;
            System.out.println("Введені вами речення являються Анограмою з урахуванням символів та регістру");
        }else{
            System.out.println("Введені вами речення НЕ являються  Анограмою урахуванням символів та регістру");
        }
        if(methAnagramSign(oneText,twoText)){
            String outResult;
            System.out.println("Введені вами речення являються Анограмою з урахуванням символів");
        }else{
            System.out.println("Введені вами речення НЕ являються  Анограмою урахуванням символів");
        }
        if(methAnagram(oneText,twoText)){
            String outResult;
            System.out.println("Введені вами речення являються Анограмою БЕЗ урахуванням символів");
        }else{
            System.out.println("Введені вами речення НЕ являються  Анограмою БЕЗ урахуванням символів");
        }
    }
    // метод сканирования
    private static String scan() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        return inputString;
    }
    // Первый ввод
    private static String oneText() {
        System.out.println("Введіть перше речення:");
        String oneText = scan();
        return oneText;
    }
    // Второй ввод
    private static String twoText() {
        System.out.println("Введіть друге речення:");
        String twoText = scan();
        return twoText;
    }
    // Метод с учетеом регистра и символов
    private static boolean methAnagramSignReg(String oneText, String twoText) {
        char[] oneTextArray = oneText.toCharArray();
        char[] twoTextArray = twoText.toCharArray();
        Arrays.sort(oneTextArray);
        Arrays.sort(twoTextArray);
        return Arrays.equals(oneTextArray, twoTextArray);
    }
    // Метод с учетеом символов
    private  static boolean methAnagramSign(String oneText, String twoText) {
        oneText = new String(oneText.toLowerCase());
        twoText = new String(twoText.toLowerCase());
        char[] oneTextArray = oneText.toCharArray();
        char[] twoTextArray = twoText.toCharArray();
        Arrays.sort(oneTextArray);
        Arrays.sort(twoTextArray);
        return Arrays.equals(oneTextArray, twoTextArray);

    }
    // Метод без учета символов и регистра
    private static boolean methAnagram(String oneText, String twoText) {
        oneText = new String(oneText.toLowerCase());
        twoText = new String(twoText.toLowerCase());
        oneText = new String(oneText.replaceAll("[^A-Za-zА-Яа-я0-9]", ""));
        twoText = new String(twoText.replaceAll("[^A-Za-zА-Яа-я0-9]", ""));
        char[] oneTextArray = oneText.toCharArray();
        char[] twoTextArray = twoText.toCharArray();
        Arrays.sort(oneTextArray);
        Arrays.sort(twoTextArray);
        return Arrays.equals(oneTextArray, twoTextArray);
    }
/////////////////////////////////////////// Проверочные запросы
//// Первый запрос:
// привет мир, да здраствует - свобода
//// Вторые запрос:
// рим ветирп ад, сводабо - вутетздрса
// Рим ветИрп Ад, свОдабо - вуТетздрса
// Рим ветИрп Ад свОдабо вуТетздрса
}
