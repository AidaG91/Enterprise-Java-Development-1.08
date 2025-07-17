package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimals {
    public static double roundToHundredth(BigDecimal value) {
        BigDecimal rounded = value.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }


    public static BigDecimal reverseSignAndRound(BigDecimal value) {
        BigDecimal flipped = value.negate();

        BigDecimal rounded = flipped.setScale(1, RoundingMode.HALF_UP);

        return rounded;
    }
}