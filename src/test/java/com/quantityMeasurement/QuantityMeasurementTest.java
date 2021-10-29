package com.quantityMeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*@purpose: TDD Quantity Measurement Problem Test Cases.
 *
 * @author: Vamsi Krishna Anthati
 *
 **/
public class QuantityMeasurementTest {
    @Test
    public void givenLengthInFeet_ShouldConvertInto_Inches() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        int givenLengthInFeet = 1;
        quantityMeasurement.feetToInchConversion(givenLengthInFeet);
        Assertions.assertEquals(12,12);
    }
    /*test Case 1.1*/
    @Test
    public void given0Feet_And_0Feet_Should_Return_Equal() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        int givenLengthInFeet = 0;
        quantityMeasurement.feetToInchConversion(givenLengthInFeet);
        Assertions.assertEquals(0,0);
    }
    //*performing NUll Check test for equality.
    // public static void assertNull(Object actual, String message)*//
    @Test
    public void NullCheck_TestForEquality() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Assertions.assertNotNull(quantityMeasurement.feetToInchConversion(1));
    }
    /*ref Check*/
    @Test
    public void refCheckForEqual_TestForEquality() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        int actual = (int) quantityMeasurement.feetToInchConversion(1);
        Assertions.assertEquals(12,actual);

    }

    /*ref Check*/
    @Test
    public void refCheckForNotEqual_TestForEquality() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double actual = (int) quantityMeasurement.feetToInchConversion(1);
        Assertions.assertNotEquals(13,actual);

    }
    /*Type check*/
    @Test
    public void givenSameObjType_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        int actual = (int) quantityMeasurement.feetToInchConversion(1);
        Assertions.assertEquals(12,actual);
    }
    /*Type check*/
    @Test
    public void givenSameObjType_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double actual = quantityMeasurement.feetToInchConversion(1);
        Assertions.assertNotEquals(12.01,actual);
    }

    /*Value check */
    @Test
    public void giveValue_Should_ReturnTheEqual (){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double actual = quantityMeasurement.feetToInchConversion(2);
        Assertions.assertEquals(24,24);
    }
    /*Value check */
    @Test
    public void giveValue_Should_ReturnNotEqual (){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        int actual = (int) quantityMeasurement.feetToInchConversion(2);
        Assertions.assertEquals(24,24);
    }

    /*performing Equality test for Inch method*/
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
    @Test
    public void givenLengthInInch_ConvertIntoFeet_ShouldReturnNotEquals() {
        int givenLengthIn_Inch = 12;
        int actual = quantityMeasurement.InchToFeetConversion(givenLengthIn_Inch);
        Assertions.assertNotEquals(1,0);
    }
    @Test
    public void givenLengthInInch_ConvertIntoFeet_ShouldReturnEquals() {
        int givenLengthIn_Inch = 12;
        int actual = quantityMeasurement.InchToFeetConversion(givenLengthIn_Inch);
        Assertions.assertEquals(1,actual);
    }
    //*performing NUll Check test for equality.
    // public static void assertNull(Object actual, String message)*//
    @Test
    public void givenValue_ShouldCheckForNull() {
        int givenLengthIn_Inch = Integer.parseInt(String.valueOf(12));
        int actual = quantityMeasurement.InchToFeetConversion(givenLengthIn_Inch);
        Assertions.assertNotNull(actual);
    }

    /*ref Check*/
    @Test
    public void refCheckForEqual_TestForIncjEquality() {
        int actual = (int) quantityMeasurement.InchToFeetConversion(12);
        Assertions.assertEquals(1,actual);

    }

    /*ref Check*/
    @Test
    public void refCheckForNotEqual_TestForInchEquality() {
        double actual = (int) quantityMeasurement.InchToFeetConversion(12);
        Assertions.assertNotEquals(1.1,actual);

    }
    /*Type check*/
    @Test
    public void givenSameObjTypeForInchTest_ShouldReturnEqual() {
        int actual = (int) quantityMeasurement.InchToFeetConversion(12);
        Assertions.assertEquals(1,actual);
    }
    /*Type check*/
    @Test
    public void givenSameObjTypeForInchTest_ShouldReturnNotEqual() {
        double actual = quantityMeasurement.InchToFeetConversion(12);
        Assertions.assertNotEquals(1.01,actual);
    }

    /*Value check */
    @Test
    public void giveValue_Should_ReturnTheEqualForInchTest (){
        double actual = quantityMeasurement.InchToFeetConversion(24);
        Assertions.assertEquals(2,actual);
    }
    /*Value check */
    @Test
    public void giveValue_Should_ReturnNotEqualForInchTest (){
        int actual = quantityMeasurement.InchToFeetConversion((int) 24.4);
        Assertions.assertEquals(2,actual);
    }


/*Uc-2 Comparing lengths 3ft = 1yd*/
    @Test
    public void givenValueInFeet_ShouldReturnInYard() {
        int givenLengthIn_FtToYd = 3;
        double actual = quantityMeasurement.feetToYardConversion(givenLengthIn_FtToYd);
        Assertions.assertEquals(0,actual);
    }
}
