package com.workintech.pool;

public class Cuboid extends Rectangle{
    private double height;

    public double getHeight() {
        if(height < 0) height = 0;
        return height;
    }
    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }
    public double getVolume(){
        return super.getArea() * height;
    }
}
