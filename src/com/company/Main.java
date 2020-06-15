package com.company;

/*
 * Classname : Main
 *
 * @version 1.0 2020.06.15
 * @author Khnyznytskyj Evgen
 *
 * Develop for your class
    1. Factory.
    2. Abstract factory.
    3. Create a class Student  - 25 fields.
    4.  Create a builder for the class Student
*/
public class Main {

    public static void main(String[] args) {
	    IVolumeFigure rectangularBox = AbstractFactory.create(2, 4,  5 , Figure.RECTANGULARBOX);
        System.out.println(rectangularBox);
        RectangularBox rectangularBox1 = BoxFactory.create(2, 4,  5);
        System.out.println(rectangularBox1);
    }
}
