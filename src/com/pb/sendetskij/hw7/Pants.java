package com.pb.sendetskij.hw7;

public class Pants extends Clothes implements WomenClothes,ManClothes{
    public Pants(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {System.out.println("Чоловічі брюки: " + info());}

    @Override
    public void dressWomen() {System.out.println("Жіночі брюки: " + info());}
}
