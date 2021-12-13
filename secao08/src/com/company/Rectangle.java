package com.company;

public class Rectangle {
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2 * width + 2 * height;
    }
    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base = " + width +
                ", altura =" + height +
                ", área = " + area() +
                ", perímetro = " + perimeter() +
                ", diagonal = " + String.format("%.2f", diagonal()) +
                '}';
    }
}
