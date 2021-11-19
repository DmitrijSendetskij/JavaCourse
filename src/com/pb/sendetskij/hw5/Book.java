package com.pb.sendetskij.hw5;


import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String title;
    private String namebook ;
    private int year;
    private String author;
    ///////////////////////////////////////////////////////
    public Book(String type,String namebook,int year,String author){
        this.title = type;
        this.namebook = namebook;
        this.year = year;
        this.author = author;
    }
    ///////////////////////////////////////////////////////
    public String getType() {return title;}
    public void setType(String type) {this.title = type;}
    public String getNamebook() {return namebook;}
    public void setNamebook(String namebook) {this.namebook = namebook;}
    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}
    ///////////////////////////////////////////////////////


}
