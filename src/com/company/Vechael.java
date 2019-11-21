package com.company;

public class Vechael {

    private String make;
    private int year;
    private String model;
    private int speedlimit;
    private  boolean accelerating;
    private  boolean deccelerating;

public Vechael(int make, String model){}

public Vechael(int speedlimit, boolean accelerating, boolean deccelerating) {
 //    this.accelerating = accelerating;
   //  this.deccelerating = deccelerating;
     this.speedlimit = speedlimit;
     this.accelerating = accelerating;
     this.deccelerating = deccelerating;

}
  public Vechael(String make,int year, String model) {
      this.make = make;
      this.year=year;
      this.model = model;
  }

    public Vechael(String make, String model) {

    }

    public Vechael() {

    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int isSpeedlimit() {
        return speedlimit;
    }

    public void setSpeedlimit(int speedlimit) {
        this.speedlimit = speedlimit;
    }

    public boolean isAccelerating() {
        return accelerating;
    }

    public void setAccelerating(boolean accelerating) {
        this.accelerating = accelerating;
    }

    public boolean isDeccelerating() {
        return deccelerating;
    }

    public void setDeccelerating(boolean deccelerating) {
        this.deccelerating = deccelerating;
    }

    @Override
    public String toString() {
        return "Vechael{" +
                "make='" + make + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                ", speedlimit=" + speedlimit +
                ", accelerating=" + accelerating +
                ", deccelerating=" + deccelerating +
                '}';
    }
}
