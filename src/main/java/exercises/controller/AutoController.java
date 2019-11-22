package exercises.controller;

import exercises.model.Auto;
import exercises.model.Engine;
import exercises.model.Fuel;

import java.util.ArrayList;
import java.util.List;

// AutoController - klasa implementująca logikę biznesową aplikacji
// 1. Zawiera listę aut
// 2. Implementuję metodę za pomomocą której można dodać auto do listy
public class AutoController {
//    private Auto [] autos = new Auto[100];  -> deklaracja pustej tablicy aut o długości 100
    private ArrayList<Auto> autos = new ArrayList<>();

    public Auto addAuto(
            String brand,
            String model,
            Engine engineType,
            Fuel fuelType,
            double price){
        // Utworzenie obiektu klasy auto
        Auto auto = new Auto(brand, model,engineType,fuelType,price);
        // zapis do listy aut
        autos.add(auto);
        return auto;
    }
    public void printAllAutos(){
        for (Auto auto : autos){
            System.out.println(auto);
        }
    }



}
