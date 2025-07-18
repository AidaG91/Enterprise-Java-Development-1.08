package org.example;

import org.example.carinventory.Sedan;
import org.example.carinventory.Truck;
import org.example.carinventory.UtilityVehicle;
import org.example.interfaces.IntArrayList;
import org.example.interfaces.IntVector;
import org.example.video.Movie;
import org.example.video.TvSeries;

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

        //Video exercise

        TvSeries show = new TvSeries("Breaking Bad", 480, 12);
        Movie film = new Movie("Django Unchained", 130, 4.7);

        System.out.println(show.getInfo());
        System.out.println(film.getInfo());

        // IntList exercise
        IntArrayList list = new IntArrayList();

        for (int i = 0; i < 12; i++) {
            list.add(i * 10);
            System.out.println("Elemento en posición " + i +": " + list.get(i));
            System.out.println("Tamaño del array: " + list.getInternalArrayLength());
       }

        //IntVector exercise
        IntVector vector = new IntVector();
        vector.add(12);
        vector.add(23);
        vector.add(34);

        System.out.println("Elemento en posición 1: " + vector.get(1)); // válido
        System.out.println("Elemento en posición 100: " + vector.get(10)); // inválido

    }
}