package application.data.entity;

public class UserSignUp {

    private String username;

    private String password;

    private RoleEnum role;

    public UserSignUp(String username, String password, RoleEnum role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public RoleEnum getRole() {
        return role;
    }
}
