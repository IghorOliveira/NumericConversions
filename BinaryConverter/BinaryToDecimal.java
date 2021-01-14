package BinaryConverter;

import java.util.Scanner;

/**
 *
 * @author Ighor Alves
 */
public class BinaryToDecimal {
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter the binary number");
        //The binary number
        String userInput=myObj.nextLine();
        //Where the final result will be presented
        int result=0;
        //To help me with the raise the number to the specific power
        int aux =0;
        
        for(int i = userInput.length()-1; i>=0; i--){
            //Proper way to use an String as an array of char
            if(userInput.charAt(i) == '1'){
                result += Math.pow(2, aux);
            }
            aux++;
        }   
        System.out.println("Result: "+result);
    }
}
