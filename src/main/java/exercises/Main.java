package exercises;

import exercises.controller.AutoController;
import exercises.model.Engine;
import exercises.model.Fuel;

// Command Line Interface
public class Main {
    public static void main(String[] args) {
        AutoController ac = new AutoController();
        // dodanie 3 aut do zamówienia
        System.out.println("Dodano: " + ac.addAuto("VW","Passat", Engine.v2_0, Fuel.diesel, 120000));
        System.out.println("Dodano: " + ac.addAuto("VW","Golf", Engine.v1_9, Fuel.diesel, 90000));
        System.out.println("Dodano: " + ac.addAuto("VW","Tiguan", Engine.v3_0, Fuel.hybrid, 180000));
        // wypisz listę aut
        ac.printAllAutos();
        // usuń auto
        System.out.println("Usunięto: " + ac.deleteAutoById(2));
        ac.printAllAutos();
        // daj rabat 10% dla auta 1
        System.out.println("Obniżona cena: " + ac.discountAutoById(1,10));
        // podnieś cenę wszystkich aut o 5%
        ac.changeAllAutosPrice(false, 5);
        ac.printAllAutos();
    }
}
