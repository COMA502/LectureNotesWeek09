package edu.dmacc.dsmcode.coma510.examples;

import java.util.ArrayList;

/**
 * Example of Singleton Pattern
 */
public class SecurityContext {

    private static SecurityContext instance;

    private ArrayList<String> users;

    private SecurityContext() {
        users = new ArrayList<>();
    }

    public static SecurityContext getInstance() {
        if(instance == null) {
            instance = new SecurityContext();
        }
        return instance;
    }

    public ArrayList<String> getUsers() {
        return users;
    }

    public void addUser(String user) {
        users.add(user);
    }
}
