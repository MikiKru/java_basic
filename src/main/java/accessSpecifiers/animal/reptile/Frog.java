package accessSpecifiers.animal.reptile;
// sprawdza czy Frog ma dostęp do składowych klasy reptile
public class Frog {

    public static void main(String[] args) {
        Reptile reptile = new Reptile();
        reptile.name = "Crazy";                 // protected - widoczny w pakiecie reptile
        System.out.println(reptile.getName());
    }

}
