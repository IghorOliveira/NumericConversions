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
public class RomanToInteger {
    
    //Max conversion: MMMCMXCIX -> 3999
    
    public static void main(String args[]){
        
        //Setting things up
        Scanner myObj = new Scanner(System.in);  
            //And getting user input
        System.out.println("Enter the roman number");
        String userInput = myObj.nextLine().toUpperCase();
        String[] numerais = new String[userInput.length()];
        int[] numeros = new int[userInput.length()];
        int result=0;
        
        
        for(int i = 0; i <= userInput.length()-1; i++){
            numerais[i]=userInput.charAt(i)+"";
            
            if(numerais[i].equals("I")){
                numeros[i] = 1;
            } 
            if(numerais[i].equals("V")){
                numeros[i] = 5;    
            } 
            if(numerais[i].equals("X")){
                numeros[i] = 10;    
            } 
            if(numerais[i].equals("L")){
                numeros[i] = 50;    
            } 
            if(numerais[i].equals("C")){
                numeros[i] = 100;    
            } 
            if(numerais[i].equals("D")){
                numeros[i] = 500;    
            } 
            if(numerais[i].equals("M")){
                numeros[i] = 1000;    
            } 
            
            
            if(i>=1){
                //Se o numero anterior for menor q o atual
                if(numeros[i]>numeros[i-1]){
                    //Subtrai
                    result += numeros[i]-(2*numeros[i-1]);
                } else{
                    //Soma
                    result += numeros[i];
                }
                
            } else if(i==0){
                //String the variable
                result=numeros[i];
            }
            
            System.out.println("The Roman Numeral "+numerais[i]+" is equal to "+numeros[i]);
        }
        if(result<0){
            result=result *(-1);
        }
        
        System.out.println(userInput+" converts to "+result);
    }
    
    
    
}
