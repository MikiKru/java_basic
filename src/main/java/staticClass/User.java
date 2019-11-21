package staticClass;

public class User {
    // składowa statyczna - pole lub metoda związana z klasą a nie z obiektem
    public static int globalId = 1;
    private int userId;
    private String login;
    private String password;

    public static void incrementGlobalId(){
        globalId++;
    }
    public User(String login, String password) {
        this.userId = globalId;
        this.login = login;
        this.password = password;
        incrementGlobalId();
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
