package authenticationTemplate;

import authenticationTemplate.controller.UserController;

public class Main {
    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.getAllUsers();
    }
}
