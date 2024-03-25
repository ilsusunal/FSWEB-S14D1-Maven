package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    public double getWidth() {
        if(width < 0) width = 0;
        return width;
    }

    public double getLength() {
        if(length < 0) length = 0;
        return length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
}
