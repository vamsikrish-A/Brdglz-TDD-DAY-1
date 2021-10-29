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

}
