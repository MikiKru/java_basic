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
        System.out.println("Lista zamówionych aut: ");
        for (int i = 0; i < autos.size(); i++){
            System.out.printf("| %3d | %15s | %15s | %15s | %15s | %15.2fzł |\n",
                    (i+1), autos.get(i).getBrand(), autos.get(i).getModel(), autos.get(i).getEngineType(),
                    autos.get(i).getFuelType(), autos.get(i).getPrice());
        }
    }
    public Auto deleteAutoById(int id){
        if(id >= 1 && id < autos.size()) {
            Auto deletedAuto = autos.remove(id - 1);
            return deletedAuto;
        }
        return null;
    }
    public Auto findAutoById(int id){
        return autos.get(id - 1);
    }
    public Auto discountAutoById(int id, int discountPercent){
        autos.get(id - 1).setPrice(autos.get(id -1 ).getPrice() * (100 - discountPercent)/100);
        return autos.get(id - 1);
    }
    public void changeAllAutosPrice(boolean isDiscounted, int discountPercent){
        for (int i = 0; i < autos.size(); i++) {
        if(isDiscounted){
            autos.get(i).setPrice(autos.get(i).getPrice() * (100 - discountPercent)/100);
            } else {
            autos.get(i).setPrice(autos.get(i).getPrice() * (100 + discountPercent)/100);
            }
        }
    }



}
