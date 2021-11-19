package com.pb.sendetskij.hw6;

public class VetClinic {
    public static void main(String[] args) throws Exception {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog(10,25,"Вася","Мясо","Будка");
        animals[1] = new Dog(15,20,"Муму","Кости","Дом");
        animals[2] = new Cat(1,2,"Изя","Корм","Дом");
        animals[3] = new Cat(2,5,"Убога","Рыбу","Бездомный");
        animals[4] = new Horse(12,105,"Изольда","Овес","Загон");
        animals[5] = new Horse(16,110,"Федя","Овес","Загон");

        for(int i=0; i<animals.length; i++ ){
            Object animal = animals[i];
            Veterinarian.treatAnimal((Animal) animal);
        };

    }
}