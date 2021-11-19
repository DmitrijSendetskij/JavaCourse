package com.pb.sendetskij.hw6;

import java.util.Objects;

public class Horse extends Animal{
    private int age;
    private int  weight;
    private String name;
    private String food;
    private String location;
    ///////////////////////////////////////////////////////
    public Horse(int age,int weight,String name,String food,String location ){
        super(animal);
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.food = food;
        this.location = location;
    }
    ///////////////////////////////////////////////////////
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public int getWeight() {return weight;}
    public void setWeight(int weight) {this.weight = weight;}
    public String getName() {return name;}
    public void setName(String weight) {this.name = name;}
    public String getFood() {return food;}
    public void setFood(String weight) {this.food = food;}
    public String getLocation() {return location;}
    public void setLocation(String weight) {this.location = location;}


    @Override
    public void makeNoise(){
        System.out.println("Конь "+ name + ": " + getMakeNoise());
    };

    @Override
    public void eat(){
        System.out.println("Конь " + name + " ест: " + getFood());
    };
    @Override
    public String toString(){
        return "Конь: " + name + age +  weight + food + location ;
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(),getAge(),getWeight(),getFood(),getLocation());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse hor = (Horse) o;
        Object answer = null;
        return answer == Horse.getAnimal() ;
    }
}