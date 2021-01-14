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
public class DecimalToHexa {
    public static void main(String args[]){
        
        //Setting things up
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter the integer number");
        int userInput = Integer.parseInt(myObj.nextLine().toUpperCase());
        String[] hexaDigits= {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        String result="";
        
        while(userInput>15){
            result= hexaDigits[userInput % 16] + result;
            userInput= userInput / 16;
        }
        
        result= hexaDigits[userInput] + result;
        System.out.println("Result: "+ result);
    }
}
