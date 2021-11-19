package com.pb.sendetskij.hw7;

public class Tshirt extends Clothes implements WomenClothes,ManClothes{
    public Tshirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {System.out.println("Чоловічі футболки: " + info());}

    @Override
    public void dressWomen() {System.out.println("Жіночі футвобли: " + info());}
}
