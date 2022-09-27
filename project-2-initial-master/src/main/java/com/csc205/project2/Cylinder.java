package com.csc205.project2;

public class Cylinder extends Shape {

    private double radius;
    private double height;

    // constructor
    public Cylinder(){
        super();
        this.radius = 0.0;
        this.height = 0.0;
    }

    //overload constructor
    public Cylinder(double newHeight, double newRadius) {
        super();
        this.radius = newRadius;
        this.height = newHeight;
    }

    //getters for radius and height
    public double getHeight() {

        return height;
    }

    public double getRadius() {

        return radius;
    }

    //setters for radius and height
    void setHeight(double newHeight) {

        height = newHeight;
    }

    void setRadius(double newRadius) {

        radius = newRadius;
    }

    public double surfaceArea() {

        return ((2.0 * Math.PI * radius * height) + (2.0 * Math.PI * Math.pow(radius, 2.0)));

    }

    public double volume() {

        return Math.PI * Math.pow(radius, 2.0) * height;

    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(radius);
        sb.append(", radius=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
