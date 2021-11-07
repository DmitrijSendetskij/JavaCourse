package com.pb.sendetskij.hw5;


import java.lang.reflect.Array;

public class Reader {
    private String fio;
    private int ticketNum;
    private String fac;
    private String date;
    private String tel;
    ///////////////////////////////////////////////////////
    public Reader(String fio,int ticketNum,String fac,String date,String tel){
        this.fio = fio;
        this.ticketNum = ticketNum;
        this.fac = fac;
        this.date = date;
        this.tel = tel;
    }

    public String getFio() {return fio;}
    public void setFio(String fio) {this.fio = fio;}
    public int getTicketNum() {return ticketNum;}
    public void setTicketNum(int ticketNum) {this.ticketNum = ticketNum;}
    public String getFac() {return fac;}
    public void setFac(String fac) {this.fac = fac;}
    public String getDate() {return date;}
    public void setDate(String date) {this.date = date;}
    public String getTel() {return tel;}
    public void setTel(String tel) {this.tel = tel;}
    ///////////////////////////////////////////////////////
    public static String takeBook(int CountBoks) {
        String answerCountBook = "Петров В.В. взял " + CountBoks + " книги";
        return answerCountBook;
    }
   public static Object takeBook(String ListBooks) {
        String[] ArrayListBook = ListBooks.split(",");
        String ListBook = "";
        for(int i = 0; i<ArrayListBook.length; i++){
            ListBook = ListBook + ArrayListBook[i] + ",";
        }
        String answerCountBook = "Петров В.В. взял книги: " + ListBook;
        return answerCountBook;
    }
    public static Object takeBook(Book[] books) {
        String ListObj = "";
        for(int i = 0; i<books.length; i++){
            ListObj = ListObj + books[i].getType() + " (" + books[i].getAuthor() + " " + books[i].getYear() + "),";

        }
        String answerCountBook = "Петров В.В. взял : " + ListObj;
        return answerCountBook;
    }
    ///////////////////////////////////////////////////////
    public static String returnBook(int CountBoks) {
        String answerCountBook = "Петров В.В. вернул " + CountBoks + " книги";
        return answerCountBook;
    }
    public static Object returnBook(String ListBooks) {
        String[] ArrayListBook = ListBooks.split(",");
        String ListBook = "";
        for(int i = 0; i<ArrayListBook.length; i++){
            ListBook = ListBook + ArrayListBook[i] + ",";
        }
        String answerCountBook = "Петров В.В. вернул книги: " + ListBook;
        return answerCountBook;
    }
    public static Object returnBook(Book[] books) {
        String ListObj = "";
        for(int i = 0; i<books.length; i++){
            ListObj = ListObj + books[i].getType() + " (" + books[i].getAuthor() + " " + books[i].getYear() + "),";

        }
        String answerCountBook = "Петров В.В. вернул : " + ListObj;
        return answerCountBook;
    }
}
