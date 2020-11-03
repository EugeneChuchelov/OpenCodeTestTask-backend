package application.controller;

public class RoleConstants {
    public static final String ADMIN = "hasRole('ADMIN')";

    public static final String USER = "hasRole('USER') || hasRole('ADMIN')";
}
