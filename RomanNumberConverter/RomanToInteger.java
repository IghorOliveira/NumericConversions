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
        String[] numerals = new String[userInput.length()];
        int[] numbers = new int[userInput.length()];
        int result=0;
        
        for(int i = 0; i <= userInput.length()-1; i++){
            numerals[i]=userInput.charAt(i)+"";
            
            if(numerals[i].equals("I")){
                numbers[i] = 1;
            } 
            if(numerals[i].equals("V")){
                numbers[i] = 5;    
            } 
            if(numerals[i].equals("X")){
                numbers[i] = 10;    
            } 
            if(numerals[i].equals("L")){
                numbers[i] = 50;    
            } 
            if(numerals[i].equals("C")){
                numbers[i] = 100;    
            } 
            if(numerals[i].equals("D")){
                numbers[i] = 500;    
            } 
            if(numerals[i].equals("M")){
                numbers[i] = 1000;    
            } 
            
            if(i>=1){
                //If the prev number is smaller then the current one
                if(numbers[i]>numbers[i-1]){
                    //Subtract it
                    result += numbers[i]-(2*numbers[i-1]);
                } else{
                    //Add it
                    result += numbers[i];
                }
            } else if(i==0){
                //Adding the furst number to tha var
                result=numbers[i];
            }
            
            System.out.println("The Roman Numeral "+numerals[i]+" is equal to "+numbers[i]);
        }
        if(result<0){
            result=result *(-1);
        }
  
        System.out.println(userInput+" converts to "+result);
    }
}
