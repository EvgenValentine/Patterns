package com.company;

import java.util.Objects;

/*
*
* Classname : Rectangular box
*
*  15 June 2020
*
* @version 1.0 2020.06.15
* @author Khnyznytskyj Evgen
*
*  Module 2 task 4
*
Develop for your class
1. Factory.
2. Abstract factory.
3. Create a class Student  - 25 fields.
4.  Create a builder for the class Student
*
* */
public class RectangularBox implements IVolumeFigure,IPackaging{
    /*
    * @param height - one of the side of rectangular box
    * @param length - one of the side of rectangular box
    * @param width - one of the side of rectangular box
     */
    private double height;
    private double length;
    private double width;

    //constructor with 3 parameters
    public RectangularBox(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }
    //empty constructor
    public RectangularBox() {

    }

    //getters and setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangularBox that = (RectangularBox) o;
        return Double.compare(that.getHeight(), getHeight()) == 0 &&
                Double.compare(that.getLength(), getLength()) == 0 &&
                Double.compare(that.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getLength(), getWidth());
    }

    @Override
    public String toString() {
        return "RectangularBox{" +
                "height=" + this.getHeight() +
                ", length=" + this.getLength() +
                ", width=" + this.getWidth() +
                ", area=" + this.getArea() +
                ", diagonal=" + this.getDiagonal() +
                ", volume=" + this.getVolume() +
                ", is cube - " + this.isCube() +
                ", is volume - " + this.isVolume() +
                '}';
    }

    @Override
    public String toJSON() {
        String json = "Rectangular box{"
                + "\""  + "length\":" + this.getLength()
                + ","
                + "\""  + "width\":" + this.getWidth()
                + ","
                + "\""  + "height\":" + this.getHeight()
                + ","
                + "\""  + "area\":" + this.getArea()
                + ","
                + "\""  + "diagonal\":" + this.getDiagonal()
                + ","
                + "\""  + "volume\":" + this.getVolume()
                + "}";
        return json;
    }

    @Override
    public String toXML() {
        String xml = "<RectangularBox>"
                + "<length>" + this.getLength() + "</length>"
                + "<width>" + this.getWidth() + "</width>"
                + "<height>" + this.getHeight() + "</width>"
                + "<area>" + this.getArea() + "</area>"
                + "<diagonal>" + this.getDiagonal() + "</diagonal>"
                + "<volume>" + this.getVolume() + "</volume>"
                +  "</RectangularBox>";

        return xml;
    }

    @Override
    public void toConsole() {
        System.out.println("RectangularBox" +
                "\nheight=" + this.getHeight() +
                "\nlength=" + this.getLength() +
                "\nwidth=" + this.getWidth() +
                "\narea=" + this.getArea() +
                "\ndiagonal=" + this.getDiagonal() +
                "\nvolume=" + this.getVolume() +
                "\nis cube - " + this.isCube() +
                "\nis volume - " + this.isVolume());
    }

    //checking that the rectangular box is a cube
    public boolean isCube() {
        return (this.getHeight() == this.getLength() &&
                this.getLength() == this.getWidth());
    }

    //get volume of rectangular box
    public double getVolume() {
        return this.getLength() * this.getHeight() * this.getWidth();
    }

    //get area of rectangular box
    public double getArea() {
        return 2 * ((this.getHeight() * this.getLength()) +
                (this.getHeight() * this.getWidth()) +
                (this.getLength() * this.getWidth()));
    }

    //get diagonal of rectangular box
    public double getDiagonal(){
        return Math.sqrt(this.getHeight()*this.getHeight()+ this.getLength()
                * this.getLength() + this.getWidth() * this.getWidth());
    }

    //checking that figure is volume
    public boolean isVolume(){
        return (this.getLength() != 0 && this.getWidth() !=0 &&
                this.getHeight() !=0);
    }
}