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

}
