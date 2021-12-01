
        package com.company;
class Harakteristic extends Dish {
    public Harakteristic(String size,String material,String color){
        super(material,size,color);
    }
    public void getInfo(){
        System.out.println(this.getMaterial() + " dish ,size is " + this.getSize() + " ,color is " +
                this.getColor());
    }
}