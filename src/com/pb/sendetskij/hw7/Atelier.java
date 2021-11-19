package com.pb.sendetskij.hw7;

public class Atelier{

    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[] {
                new Tshirt(Size.XXS, 100, "Білий"),
                new Pants(Size.XS, 200, "Чорні"),
                new Skirt(Size.S, 300, "Рожевий"),
                new Tie(Size.L, 500, "Блакитний")
        };
        dressMan(clothes);
        System.out.println();
        dressWomen(clothes);
    }

    private static void dressMan(Clothes[] clothes) {
        for(Clothes c: clothes) {
            if (c instanceof ManClothes) {
                ((ManClothes) c).dressMan();
            }
        }
    }

    private static void dressWomen(Clothes[] clothes) {
        for(Clothes c: clothes) {
            if (c instanceof WomenClothes) {
                ((WomenClothes) c).dressWomen();
            }
        }
    }
}
