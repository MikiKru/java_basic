package accessSpecifiers;

import accessSpecifiers.animal.Animal;
import accessSpecifiers.animal.mammal.Mammal;
import accessSpecifiers.animal.reptile.Reptile;

public class Main {
    public static void main(String[] args) {

        Mammal mammal = new Mammal();
        mammal.setAge(10);
        System.out.println(mammal);

        Reptile reptile = new Reptile();
//        System.out.println(reptile.name); protected nie jest widoczny poza pakietem reptile
//        System.out.println(reptile.getName());

        Animal animal = new Animal();
//        animal.speed;   // perivate nie jest dostępny poza pakietem animal
//        animal.getSpeed();
    }
}
