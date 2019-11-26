package authenticationTemplate;

import authenticationTemplate.controller.UserController;

public class Main {
    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.getAllUsers();
        System.out.println("Wynik logowania: " +
                (uc.logInUser("X","x") == null ? "nie zalogowano" : uc.logInUser("X","x")));
        System.out.println("Wynik logowania: " +
                (uc.logInUser("mk@mk.pl","MMMmmm111_") == null ? "nie zalogowano" : uc.logInUser("mk@mk.pl","MMMmmm111_")));
    }
}
