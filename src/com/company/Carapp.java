package com.company;

public class Carapp {

    public static void main(String[] args) {
        // write your code here

        Car car1 = new Car("Shevy", 2005, "Malibu", 80, true, false);

//        car1.setMake("Shevy");
//        car1.setYear(2005);
//        car1.setModel("Malibu");
//        car1.setAccelerating(true);
//        car1.setDeccelerating(false);
//        car1.setSpeedlimit(80);
        boolean c = true;
        int x = 0;
        if (x > 90) {
            System.out.print("Acclerating");
            c = true;
        }
        else if (x == 80) {
            System.out.println("Speedlimit");
        }
        else {
            System.out.println("Deccelerating");

       }
       System.out.println(car1.toString());
    }

}
