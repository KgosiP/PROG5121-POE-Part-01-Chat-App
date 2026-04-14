/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chatapp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @Kgosi.P
 */
public class LoginTest {
    
    @Test 
    public void testCheckUserNameCorrectly() {
        Login login = new Login("Kyle", "Smith", "Ky1_1", "Ch&&8ec@ke99!", "+27838968976");
        assertTrue (login.checkUserName());
        
    }
    
    @Test
    public void testCheckUserNameIncorrectly() {
        Login login = new Login("Kyle", "Smith", "Kyle!!!!!!!", "Ch&&8ec@ke99!", "+27838968976");
        assertFalse (login.checkUserName());
        
    }
    
    @Test
    public void testPasswordMeetsComplexity() {
        Login login = new Login("Kyle", "Smith", "Kyl_1", "password", "+27838968976");
        assertTrue(login.checkUserName());
        
        
    }
    
    @Test
    public void testPasswordFailssComplexity() {
        Login login = new Login ("Kyle", "Smith", "Kyl_1", "pasword", "+27838968976");
        assertFalse (login.checkPasswordComplexity());
        
    }
    
    @Test
    public void testCellPhoneCorrectlyFormatted() {
        Login login = new Login("Kyle", "Smith", "Kyl_1", "Ch&&8ec@ke99!", "+27838968976");
        assertTrue (login.checkCellPhoneNumber());
        
    }
    
    @Test
    public void testCellPhoneIncorrectlyFormatted() {
        Login login = new Login("Kyle", "Smith", "Kyl_1", "ch&&8ec@ke99!", "08966553");
        assertFalse  (login.checkCellPhoneNumber());
        
    }
    
    @Test
    public void testLoginSuccessful() {
        Login login = new Login("Kyle", "Smith", "Kyl_1", "Ch&&8ec@ke99!", "+27838968976");
        assertTrue (login.loginUser("Kyl_1", "Ch&&8ec@ke99!"));
        
    }
    
    @Test
    public void testLoginFailed() {
        Login login = new Login("Kyle", "Smith", "Kyl_1", "Ch&&8ec@ke99!", "+27838968976");
        assertFalse (login.loginUser("wrongUser", "wrong password"));
        
    }
    
    
}

    

