package hw2.ex7_8;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data       // getters & setters & toString()
@AllArgsConstructor // konstruktor z wszystkimi parametramy
public class Employee {
    private String name, lastname;
    private final String PESEL;
    private LocalDate emplDate;
    private LocalDate birthDate;
    private double salaryNet;
}
