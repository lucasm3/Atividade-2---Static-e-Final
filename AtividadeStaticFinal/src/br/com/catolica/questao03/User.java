package br.com.catolica.questao03;

public class User {
    private final int id;
    private String name;
    private String email;
    private static int totalUsers = 0;

    public User(String name, String email) {
        this.id = ++totalUsers;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }

    public static boolean isValidEmail(String email) {
        return email.contains("@");
    }
}
