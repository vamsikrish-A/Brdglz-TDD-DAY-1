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
    /*UC1-Comparing lengths 1ft = 12in.
    * TC-1.1- given 0 Feet should return 0
    * */
    public double feetToInchConversion(Integer givenLengthInFeet) {
        double conversion = givenLengthInFeet * 12;
        return conversion;
    }

    public int InchToFeetConversion(int length) {
        int conversion = length/12;
        return conversion;
    }

    public double feetToYardConversion(int length) {
        double conversion = length/3;
        return conversion;
    }
/*1in = 12ft
* 3ft = 1yrd
* 1 yard = 36in*/
    public double inchToYardConverter(int givenLengthIn_inToYd) {
        double conversion = givenLengthIn_inToYd /36;
        return conversion;
    }

    public double yardToInchConverter(int givenLengthIn_ydToIn) {
        double conversion = givenLengthIn_ydToIn *36;
        return conversion;
    }

    public double yardToFeetConversion(int givenLengthIn_ydToFt) {
        double conversion = givenLengthIn_ydToFt * 3;
        return conversion;
    }
}
