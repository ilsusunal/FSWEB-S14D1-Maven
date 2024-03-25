package com.workintech.cylinder;

public class Cylinder extends  Circle{
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        if(height < 0) height = 0;
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * height;
    }
}
