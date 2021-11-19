package com.pb.sendetskij.hw6;

import java.util.Objects;

public class Animal {

    static Animal animal;
    private String food;
    private String location;
    private String makeNoise;

    ///////////////////////////////////////////////////////
    public Animal(Animal animal){

    }

    public Animal() {

    }

    public String getFood() {return food;}
    public void setFood(String food) { this.food = food;}
    public String getLocation() {return location;}
    public void setLocation(String location) {this.location = location; }
    public String getMakeNoise() {return makeNoise;}
    public void setMakeNoise(String makeNoise) { this.makeNoise = makeNoise;}
    public static Animal getAnimal() {return animal;}
    public void setAnimal(Animal animal) { this.animal = animal;}

    public void makeNoise(){
        System.out.println("Живетное: " + makeNoise);
    };
    public void eat(){
        System.out.println("Животное ест: " + food);
    };
    public void sleep(){
        System.out.println("Животное спит");
    };
    public void location(){
        System.out.println("Проживает в " + location);
    };
    public String toString(){
        return "Животное: " + food +  location ;
    }
    public int hashCode(){
        return Objects.hash(getFood(),getLocation());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal An = (Animal) o;
        Object answer = null;
        return answer == Animal.getAnimal() ;
    }
}