package com.company;
public abstract class Dish {
    private String size;
    private String color;
    private String material;

    public Dish (String size, String material, String color){
        this.material = material;
        this.color = color;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public abstract void getInfo();
}