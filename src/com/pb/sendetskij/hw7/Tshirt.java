package com.pb.sendetskij.hw7;

public class Tshirt extends Clothes implements WomenClothes,ManClothes{
    @Override
    public void dressWomen(){
        System.out.println("название, размер, цену, цвет");
    }
    public void dressMan (){
        System.out.println("название, размер, цену, цвет");
    }
}
