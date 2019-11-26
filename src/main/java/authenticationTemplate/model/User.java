package authenticationTemplate.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data   // generuje w kodzie gettery i settery oraz toString()
public class User {
    private static int globalId;
    private int userId;
    private String email;
    private String password;
    private LocalDateTime registrationDateTime;

    public User(String email, String password) {
        globalId++;
        this.userId = globalId;
        this.email = email;
        this.password = password;
        this.registrationDateTime = LocalDateTime.now();
//        setRegistrationDateTime(LocalDateTime.now());        to samo
    }
}
