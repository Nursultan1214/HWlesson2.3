package com.company;

public class BMW extends Car implements Printable{
    private String series;
    private String Equipment;

    public BMW(String color, int year, String series, String equipment) {
        super(color, year);
        this.series = series;
        Equipment = equipment;
    }

    public String getSeries() {
        return series;
    }

    public String getEquipment() {
        return Equipment;
    }

    @Override
    public void print() {
        System.out.println(" Series:" + getSeries() + " Equiment:" + getEquipment());
    }
}



