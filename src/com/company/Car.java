package com.company;

public class Car extends Vechael {
    private String make;
    private String model;
    // private int year;

    public Car(String shevy, int i, String malibu, int i1, boolean b, boolean b1) {
        super();
    }
    public Car(String make, String model){
        super(make, model);
    }



    public String getMake() {
        return make;
    }


    public void setMake(String make) {
        this.make = make;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

