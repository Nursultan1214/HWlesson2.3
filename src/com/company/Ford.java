package com.company;

public class Ford extends Car implements Printable{
    private String country;
    private int price;

    public Ford(String color, int year, String country, int price) {
        super(color, year);
        this.country = country;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(" Country:" + getCountry() + " Price" + getPrice());
    }
}

