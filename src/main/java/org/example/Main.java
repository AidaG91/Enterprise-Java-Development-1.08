package org.example;

import org.example.carinventory.Sedan;
import org.example.carinventory.Truck;
import org.example.carinventory.UtilityVehicle;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // Big decimals exercise
        double r1 = BigDecimals.roundToHundredth(new BigDecimal("7.36588741"));
        System.out.println("Redondeado a centésima (double): " + r1);

        BigDecimal r2 = BigDecimals.reverseSignAndRound(new BigDecimal("97.63214"));
        System.out.println("Signo invertido y redondeado a décima (BigDecimal): " + r2);

        //Car Inventory exercise
        Sedan miSedan = new Sedan("VIN1234567", "Citroen", "C5", 87291);
        System.out.println(miSedan.getInfo());

        UtilityVehicle myUtilityVehicle = new UtilityVehicle("VIN8737162", "Jeep", "Wagoneer", 145879, true);
        System.out.println(myUtilityVehicle.getInfo());

        Truck myTruck = new Truck("VIN5874123", "MAN", "Serie TGX", 547741, 2500);
        System.out.println(myTruck.getInfo());


    }
}