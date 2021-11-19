package com.pb.sendetskij.hw8;

import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) {
        Auth auth = new Auth();

        String user;
        String pass;
        String passDouble;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("!!!Будь ласка пройдіть реєстрацію!!!");
            System.out.println("Введіть логін:");
            user = scan.next();
            System.out.println("Введіть пароль:");
            pass = scan.next();
            System.out.println("Повторіть пароль:");
            passDouble = scan.next();
            try {
                auth.signUp(user, pass, passDouble);
            } catch (WrongLoginException | WrongPasswordEqualsException | WrongPasswordException ex) {
                ex.printStackTrace();
                if (true) {
                    continue;
                };
            };
            while (true) {
                System.out.println("!!!Будь ласка пройдіть аутентифыкцію!!!");
                System.out.println("Введіть логін:");
                user = scan.next();
                System.out.println("Введіть пароль:");
                pass = scan.next();
                try {
                    auth.signIn(user, pass);
                    break;
                } catch (WrongLoginException | WrongPasswordEqualsException ex) {
                    ex.printStackTrace();
                    if (true) {
                        continue;
                    }
                };
            }
            break;
        }
    };
}

