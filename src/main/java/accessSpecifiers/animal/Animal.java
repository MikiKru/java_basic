package accessSpecifiers.animal;

public class Animal {
    private double speed = 36.6;

    private double getSpeed(){
        return this.speed;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speed = 500;
        System.out.println(animal.getSpeed());
    }
}
