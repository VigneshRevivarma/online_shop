package com.example.online_shop.model;

public class Item {

    public Item(){
    }

    public Item(int id, String name, String desc, String imagePath, double price) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.imagePath = imagePath;
        this.price = price;
    }
    private int id;
    private String name;
    private String desc;
    private String imagePath;
    private double price;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImagePath() {
        return imagePath;
    }
    public double getPrice() {
        return price;
    }

}
