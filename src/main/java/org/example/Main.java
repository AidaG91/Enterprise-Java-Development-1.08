package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        double r1 = BigDecimals.roundToHundredth(new BigDecimal("7.36588741"));
        System.out.println("Redondeado a centésima (double): " + r1);

        BigDecimal r2 = BigDecimals.reverseSignAndRound(new BigDecimal("97.63214"));
        System.out.println("Signo invertido y redondeado a décima (BigDecimal): " + r2);
    }
}