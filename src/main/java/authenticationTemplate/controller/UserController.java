package authenticationTemplate.controller;

import authenticationTemplate.model.User;
import authenticationTemplate.utility.InMemoryDB;

public class UserController {
    // serwis wypisujący na ekranie wszystkich użytkowników z tabelki user
    public void getAllUsers(){
        System.out.printf("| %3s | %20s | %20s | %30s |\n", "ID", "EMAIL", "PASSWORD", "REGISTRATION");
        for (User u : InMemoryDB.tableUser) {
            System.out.printf("| %3d | %20s | %20s | %30s |\n",
                    u.getUserId(), u.getEmail(), u.getPassword(), u.getRegistrationDateTime());
        }
    }
    // serwis do logowania użytkownika
    public User logInUser(String email, String password){
        User user = null;
        for (User u : InMemoryDB.tableUser) {
            if(u.getEmail().equals(email) && u.getPassword().equals(password) ){
                user = u;
            }
        }
        return user;
    }



}
