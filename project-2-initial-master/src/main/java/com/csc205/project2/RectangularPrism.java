package com.csc205.project2;

public class RectangularPrism extends Shape {

    private double length, width, height;

    //constructor
    public RectangularPrism(){
        super();
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;
    }

    //overload constructor
    public RectangularPrism(double newLength, double newWidth, double newHeight) {
        super();
        this.length = newLength;
        this.width = newWidth;
        this.height = newHeight;
    }

    //getters for length, width, and height
    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    //setters for length, width, and height

    void setLength(double newLength) {
        this.length = newLength;
    }

    void setWidth(double newWidth) {
        this.width = newWidth;
    }

    void setHeight(double newHeight) {
        this.height = newHeight;
    }

    public double surfaceArea() {
        return 2.0 * ((width * length) + (height * length) + (height * width));
    }

    public double volume() {
        return width * height * length;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangular Prism {");
        sb.append("width=").append(width);
        sb.append(", length=").append(length);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }

}
