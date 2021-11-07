package com.pb.sendetskij.hw5;

import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        /**
         * Книги
         */
        Book book1 = new Book("Приключения", "Книга1", 2021, "Вася");
        Book book2 = new Book("Триллер", "Книга2", 2021, "Федя");
        Book book3 = new Book("Ужасы", "Книга3", 2021, "Инкогнито");
        Book[] books = {book1, book2, book3};
        /**
         * Читатели
         */
        Reader lib1 = new Reader("Хряков Х.Х.", 1234567, "Разделочная", "2021-11-31", "0330000000");
        Reader lib2 = new Reader("Оленев О.О.", 7654321, "Разделочная", "2021-11-31", "0330000000");
        Reader lib3 = new Reader("Егеревич Е.Е.", 0000000, "Учебный", "1901-01-01", "0000000000");
        Reader[] readers = {lib1, lib2, lib3};
        /**
         * Показать книги
         */
        for (int i = 0; i < books.length; i++) {
            System.out.println("Жанр: " + books[i].getType() + " / "
                    + "Наименование: " + books[i].getNamebook() + " / "
                    + "Год: " + books[i].getYear() + " / "
                    + "Автор: " + books[i].getAuthor() + " / "
            );
        }
        /**
         * Показать читателей
         */
        for (int i = 0; i < readers.length; i++) {
            System.out.println("ФОИ: " + readers[i].getFio() + " / "
                    + "Билет: " + readers[i].getTicketNum() + " / "
                    + "Факультет: " + readers[i].getFac() + " / "
                    + "Дата: " + readers[i].getDate() + " / "
                    + "Тел.: " + readers[i].getTel() + " / "
            );
        }
        /**
         * Колличество книг через указания в консоле
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть кількість книжок");
        int CountBoks = scan.nextInt();
        System.out.println(Reader.takeBook(CountBoks));

        /**
         * Цикл для получения перечня взятых книг
         */
        String ListBookString = "";
        for (int i = 0; i < books.length; i++) {
            ListBookString = ListBookString + books[i].getNamebook() + ",";
        }
        System.out.println(Reader.takeBook(ListBookString));
        /**
         * перечень объектов
         */
        System.out.println(Reader.takeBook(books));
        /////////////////////////////////////////////////////////
        /**
         * Колличество сданных книг через указания в консоле
         */
        System.out.println("Введіть кількість книжок");
        int CountBoksReturn = scan.nextInt();
        System.out.println(Reader.returnBook(CountBoksReturn));

        /**
         * Цикл для получения перечня взятых книг
         */
        String ListBookStringReturn = "";
        for (int i = 0; i < books.length; i++) {
            ListBookStringReturn = ListBookStringReturn + books[i].getNamebook() + ",";
        }
        System.out.println(Reader.returnBook(ListBookStringReturn));
        /**
         * перечень объектов
         */
        System.out.println(Reader.returnBook(books));
    }
}


