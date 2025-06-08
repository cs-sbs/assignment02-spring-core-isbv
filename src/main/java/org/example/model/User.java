package org.example.model;

public class User {
    private String username;
    private String password;

    // 构造方法、getters 和 setters
    public  User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Object getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }
}
