package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("BMW").print();
        createObject("Bentley").print();
        createObject("Ford").print();

    }

    private static Printable createObject(String className) {
        switch (className){
            case "Bentley":
                Bentley bentley = new Bentley("Black", 2002, "260km/h", "Bentayga");
                return bentley;
            case "BMW":
                BMW BMW = new BMW("White", 1998, "2-generations", "VIP");
                return BMW;
            case "Ford":
                Ford Ford = new Ford("red", 2002, "Germany", 15000);
                return Ford;
            default:return null;
        }
    }
}
