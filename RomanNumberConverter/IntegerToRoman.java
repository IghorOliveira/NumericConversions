/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RomanNumberConverter;

import java.util.Scanner;

/**
 *
 * @author Ighor Alves
 */
public class IntegerToRoman {
    public static void main(String args[]){
        //Works for numbers between 1 and 3999
        
        //Setting things up
        Scanner myObj = new Scanner(System.in);  
            //And getting user input
            //112
        System.out.println("Enter the integer number");
        int userInput = Integer.parseInt(myObj.nextLine().toUpperCase());
        String[] numerais = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] numeros = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String result="";
        
        for(int i =0; i<numeros.length; i++){
            while(userInput>=numeros[i]){
                result= result+numerais[i];
                userInput= userInput-numeros[i];
            }
        }
        
        System.out.println("Result: "+result);
        

        
        
    }
}
