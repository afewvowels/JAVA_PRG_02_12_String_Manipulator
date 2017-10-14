/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_02_12_string_manipulator;

import java.util.Scanner;

/**
 *
 * @author bluebackdev
 * Write a program that asks the user to enter the name of his or her favorite
 * city. Use a String variable to store the input. The program should display
 * the following:
 * 
 *  - The number of characters in the city name
 *  - The name of the city in all uppercase letters
 *  - The name of the city in all lowercase letters
 *  - The first character in the name of the city
 */
public class JAVA_PRG_02_12_String_Manipulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare variables
        int intNumberOfLetters;
        
        String strCityName;
        String strCityModified;
        
        char chrCityInitial;
        
        // Create keyboard for user input
        Scanner scrKeyboard = new Scanner(System.in);
        
        // Prompt user for city name
        System.out.print("Please enter the name of your favorite city: ");
        strCityName = scrKeyboard.nextLine();
        
        // Get length of string and output
        intNumberOfLetters = strCityName.length();
        System.out.println("\n" + strCityName + "'s character count is " +
                            intNumberOfLetters);
        
        // Define city name as all uppercase
        strCityModified = strCityName.toUpperCase();
        System.out.println(strCityName + " in all uppercase is " +
                            strCityModified);
        
        // Convert city name to all lowercase
        strCityModified = strCityName.toLowerCase();
        System.out.println(strCityName + " in all lowercase is " +
                            strCityModified);
    }
    
}
