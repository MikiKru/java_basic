package authenticationTemplate.controller;

import authenticationTemplate.model.User;
import authenticationTemplate.utility.InMemoryDB;

import java.util.regex.Pattern;

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
    private boolean emailValid(String email){
        String patternEmail = "^([a-z]|[A-Z]|[0-9]|[._#]|[^\\s\\t@]){1,}@([a-z]|[A-Z]|[0-9]|[._#]|[^\\s\\t@]){1,}\\.([a-z]|[A-Z]|[^\\s\\t@]){2,}$";
        boolean emailValidResult = false;
        if(Pattern.matches(patternEmail,email)){
            emailValidResult = true;
        }
        return emailValidResult;
    }
    private String passwordValid(String password){
        String patternLowerCase = ".*[a-z]{1,}.*";
        String patternUpperCase = ".*[A-Z]{1,}.*";
        String patternDigit = ".*[0-9]{1,}.*";
        String patternSpecialCharacter = ".*[-_.&]{1,}.*";
        String patternWithoutSpace = ".*[\\s|\\t]{1,}.*";

        String passwordValidResult = null;
        if(password.length() < 8){
            passwordValidResult = "Hasło musi zawierać co najmniej 8 znaków";
        } else if (!Pattern.matches(patternLowerCase, password)){
            passwordValidResult = "Hasło musi posiadać co najmniej jedną małą literę";
        } else if (!Pattern.matches(patternUpperCase, password)) {
            passwordValidResult = "Hasło musi posiadać co najmniej jedną wielką literę";
        } else if (!Pattern.matches(patternDigit, password)){
            passwordValidResult = "Hasło musi posiadać co najmniej jedną cyfre";
        } else if (!Pattern.matches(patternSpecialCharacter, password)){
            passwordValidResult = "Hasło musi posiadać co najmniej jeden znak specjalny {-_.&}";
        } else if (Pattern.matches(patternWithoutSpace, password)) {
            passwordValidResult = "Hasło nie może zawierać znaków białych";
        }
        return passwordValidResult;
    }
    public boolean isEmailUnique(String email){
        boolean isUnique = true;
        for (User u : InMemoryDB.tableUser) {
            if(u.getEmail().equals(email)){
                isUnique = false;
            }
        }
        return isUnique;
    }
    public String registerUser(String email, String password){
        String registerResult = "";
        if(emailValid(email)){
            if(passwordValid(password) == null){
                if(isEmailUnique(email)) {
                    User user = new User(email, password);
                    InMemoryDB.tableUser.add(user);
                    registerResult = user.toString();
                } else {
                    registerResult = "Już istnieje taki adres e-mail " + email + " w bazie danych";
                }
            } else {
                registerResult = passwordValid(password);
            }
        } else {
            registerResult = "Błędny adres e-mail";
        }
        return registerResult;
    }



}
