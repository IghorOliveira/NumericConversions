/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryConverter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ighor Alves
 */
public class DecimalToBinary {
    public static void main(String args[]){
        
        //Setting things up
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter the integer number");
        int userInput = Integer.parseInt(myObj.nextLine().toUpperCase());
        String result="";
        
        while(userInput>1){
            result= userInput%2 + result;
            userInput= userInput/2;
        }
        
        result = userInput + result;
        System.out.println("Result: "+result);

    }
}
