package at.auva.litec.auva;

import java.util.HashSet;

public class User {
    private int Id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private String token;
    private int usergroup;
    public HashSet<Integer>MaschineTypes=new HashSet<>(  );

    public User(int id, String firstName, String lastName, String email, String username, String password, String token, int usergroup) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.token = token;
        this.usergroup = usergroup;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getUsergroup() {
        return usergroup;
    }

    public void setUsergroup(int usergroup) {
        this.usergroup = usergroup;
    }
}
