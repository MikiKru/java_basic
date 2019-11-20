package staticClass;

public class Main {
    public static void main(String[] args) {
        // Odwołanie do składowej statycznej
        // 1. Nie wymaga utworzenia obiektu
        // 2. Odwołujemy się poprzedzając składową nazwą klasy
        // 3. Jest tylko jedna kopia składowej statycznej w ramach klasy
        User user1 = new User("x","x");
        System.out.println(user1);
        System.out.println(User.globalId);
        User user2 = new User("y","y");
        System.out.println(user2);
//        User.incrementGlobalId();
        System.out.println(User.globalId);
        User user3 = new User("z","z");
        System.out.println(user3);

    }
}
