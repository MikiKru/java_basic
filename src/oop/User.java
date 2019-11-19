package oop;

// ALT + Ins -> generate
public class User {
    // pola -> zmienne i obiekty
    String name;
    String lastName;
    char gender;
    boolean activated;
    double salary_net;
    // konstruktor -> metoda która jest wywoływana podczas tworzenia obiektu
    public User() {}
    public User(String name, String lastName, char gender, boolean activated, double salary_net) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.activated = activated;
        this.salary_net = salary_net;
    }
    // metoda bezargumentowa nie zawacająca żadnej wartości -> 'typu void'
    void printUser(){
        System.out.printf(
                "| %10s | %15s | %3c | %6b | %8.2fzł |\n",
                this.name, this.lastName, this.gender, this.activated,this.salary_net);
        // this -> wskazuje na obiekt globalny w klasie
    }
    // metoda zwracająca wartość
    double calculateSalaryGross(){
        double salaryGross = salary_net * 1.23;
        return salaryGross;
    }
    String modifyUserParameters(double salary_net, boolean activated){
        this.salary_net = salary_net;
        this.activated = activated;
        return String.format("| %10s | %15s | %3c | %6b | %8.2fzł |\n",
                this.name, this.lastName, this.gender, this.activated,this.salary_net);
    }


}
