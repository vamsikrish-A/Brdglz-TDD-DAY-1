package com.quantityMeasurement;
/*@purpose: TDD Quantity Measurement Problem.
*
* @author: Vamsi Krishna Anthati
*
**/

public class QuantityMeasurement {
    public static void main(String[] args) {
        System.out.println("Welcome to TDD - Quantity Measurement Problem.");
    }

    public double feetToInchConversion(int givenLengthInFeet) {
        double conversion = givenLengthInFeet * 12;
        return conversion;
    }
    /*UC1-Comparing lengths*/
}
