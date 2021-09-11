package com.company;

public class Bentley extends Car implements Printable{
    private String maxSpeed;
    private String model;

    public Bentley(String color, int year, String maxSpeed, String model) {
        super(color, year);
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void print() {
        System.out.println("Max speed:" + getMaxSpeed() + " Model:" + getModel());
    }
}
