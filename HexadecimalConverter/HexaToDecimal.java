/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HexadecimalConverter;

import java.util.Scanner;

/**
 *
 * @author Ighor Alves
 */
public class HexaToDecimal {
    //Logic: ((16^position in array)*digit value)
    //Remember to create an general unit converter
    //Uses ASCII values to convert Hex to Decimal
    public static void main(String args[]){
        
        //Setting things up
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter the hexa number");
        String userInput=myObj.nextLine().toUpperCase();
        int result=0;
        int aux = 0;
        
        for(int i = userInput.length()-1; i>=0; i--){
            int digitValue = 0;
            char charInString = userInput.charAt(i);
            //Here I just want to know if the char is a number or not
            try{
                //if is a number I just use the integer value of it
                digitValue=Character.getNumericValue(charInString);
            } catch (NumberFormatException e){
                //if is not a number I use the ASCII value to calculate the integer value
                //Only works if the user inputs hex digits correctly
                digitValue=charInString-55;
            }
            
            System.out.println("Input: "+digitValue);
            result+=(int) (Math.pow(16,aux)*digitValue);
            System.out.println("Processing: (16^"+aux+")x"+digitValue+"= "+(int) (Math.pow(16,aux)*digitValue));
            aux++;
        }
        
        System.out.println("Result: "+result);
    }
}
