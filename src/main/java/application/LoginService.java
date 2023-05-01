package main.java.application;

import java.util.Scanner;

public class LoginService {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "pass";

    public boolean auth() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz nazwę użytkownika:");
        String username = scanner.nextLine();

        System.out.println("Wpisz hasło:");
        String password = scanner.nextLine();

        if (username.equals(USERNAME) && password.equals(PASSWORD))
            return true;
        else
            return false;

    }

}
