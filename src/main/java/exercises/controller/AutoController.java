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
        for (int i = 0; i < autos.size(); i++){
            System.out.printf("| %3d | %15s | %15s | %15s | %15s | %15.2fzł |",
                    (i+1), autos.get(i).getBrand(), autos.get(i).getModel(), autos.get(i).getEngineType(),
                    autos.get(i).getFuelType(), autos.get(i).getPrice());
        }
    }



}
