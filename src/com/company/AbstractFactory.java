package com.company;
/*
 *
 * Classname : AbstractFactory
 * Description : abstract factory pattern for RectangularBox class
 *
 *  15 June 2020
 *
 * @version 1.0 2020.06.15
 * @author Khnyznytskyj Evgen
 *
 * */
public class AbstractFactory {

    /*
    * Method of abstract factory which build objects
    *
    * @param sideA - one of the side
    * @param sideB - one of the side
    * @param sideC - one of the side
    * @param figure - enumeration element from class Figure
     */
    public static IVolumeFigure create(double sideA, double sideB, double sideC, Figure figure){

        switch (figure) {
            case RECTANGULARBOX: return new RectangularBox(sideA, sideB, sideC);
            default: return null;
        }
    }
}
