/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.chatapp;

/**
 *
 * @Kgosi.P
 */

import java.util.Scanner;

public class ChatApp {
    
// class collects all the registration details & asks for login credentials.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Register ===");
        System.out.println("Enter first name: ");
        String firstName = input.nextLine();
        
        System.out.println("Enter last name: ");
        String lastName = input.nextLine();
        
        System.out.println("Enter username: ");
        String username = input.nextLine();
        
        System.out.println("Enter password: ");
        String password = input.nextLine();
        
        System.out.println("Enter cell phone number: ");
        String cellPhone = input.nextLine();
        
        Login user = new Login(firstName, lastName, username, password, cellPhone);
        System.out.println(user.registerUser());
        
        System.out.println("\n=== Login ===");
        System.out.println("Enter username: ");
        String enteredUsername = input.nextLine();
        
        System.out.println("Enter Password: ");
        String enteredPassword = input.nextLine();
        
        System.out.println(user.returnLoginStatus(enteredUsername, enteredPassword));
        
        input.close();
      
    }
    
    
}
