package com.pb.sendetskij.hw7;

public abstract class Clothes {
    private String name;
    protected Size size;
    protected int cost;
    protected String color;

    public String getName() {return name;};
    public void setName(String name) {this.name = name;};
    public int getCost() {return cost;};
    public void setCost(int cost) {this.cost = cost;};
    public String getColor() {return color;};
    public void setColor(String color) {this.color = color;};

    public Clothes(Size size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public String info(){

        return  "Розмір: " +  size.name() + "/"+ size.getDescription() + "/" + size.getEuroSize()  + " Колір:" + color + " Вартість: " + cost;
    };
}
