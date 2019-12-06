package edu.dmacc.dsmcode.coma510.examples;

public class SingletonMain {
    public static void main(String[] args) {

//        SecurityContext.getUsers();//getUsers is not static
        SecurityContext security = SecurityContext.getInstance();//getInstance is static

        System.out.println("Users: " + security.getUsers());
        security.addUser("greg");
        System.out.println("Users: " + security.getUsers());

        System.out.println("Users: "
                + SecurityContext.getInstance().getUsers());
    }
}
