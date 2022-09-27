package com.csc205.project2;

public class Cube extends Shape {

    private double width;

    //constructor
    public Cube() {
        super();
        this.width = 0.0;
    }

    //overload constructor
    public Cube(double newWidth) {
        super();
        this.width = newWidth;
    }

    //getter for width
    public double getWidth() {
        return this.width;
    }

    //setter for width
    void setWidth(double newWidth) {
        this.width = newWidth;
    }

    public double surfaceArea() {
        return 6 * Math.pow(width, 2.0);
    }

    public double volume() {

        return Math.pow(width, 3.0);

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
