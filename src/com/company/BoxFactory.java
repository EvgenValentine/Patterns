package com.company;
/*
*
* Classname : BoxFactory
* Description : factory pattern for RectangularBox class
*
*  15 June 2020
*
* @version 1.0 2020.06.15
* @author Khnyznytskyj Evgen
*
* */
public class BoxFactory{
    /*
     * Method of abstract factory which build objects
     *
     * @param sideA - one of the side
     * @param sideB - one of the side
     * @param sideC - one of the side
     *
     */
    public static RectangularBox create(double sideA, double sideB, double sideC){
        if(sideA>0 && sideB>0 && sideC>0){
            return new RectangularBox(sideA,sideB,sideC);
        }else{
            return null;
        }
    }
}
